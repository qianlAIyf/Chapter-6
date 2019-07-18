package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

import java.util.Date;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {
    }

    public static class Notes implements BaseColumns {
        public static final String TABLE_NAME = "note";
        public static final String COLUMN_NAME_DATE = "date";
        public static final String COLUMN_NAME_STATE = "state";
        public static final String COLUMN_NAME_CONTENT = "content";
    }

    public static final String SQL_CREATE_NOTES = "CREATE TABLE " + Notes.TABLE_NAME + "(" + Notes._ID + " INTEGER PRIMARY KEY," + Notes.COLUMN_NAME_DATE + " DATE," + Notes.COLUMN_NAME_STATE + " INTEGER," + Notes.COLUMN_NAME_CONTENT + " TEXT )";

    public static final String SQL_DELETE_NOTES = "DROP TABLE IF EXISTS " + Notes.TABLE_NAME;
}
