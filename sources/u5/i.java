package u5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
public final class i extends SQLiteOpenHelper {
    public static final String f55726c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static final int d = 7;
    public static final List f55727e = Arrays.asList(new h(0), new h(1), new h(2), new h(3), new h(4), new h(5), new h(6));
    public final int f55728a;
    public boolean f55729b;

    public i(int i3, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i3);
        this.f55729b = false;
        this.f55728a = i3;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        List list = f55727e;
        if (i10 <= list.size()) {
            while (i3 < i10) {
                switch (((h) list.get(i3)).f55725a) {
                    case 0:
                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                        break;
                    case 1:
                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                        break;
                    case 3:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                        break;
                    case 4:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                        sQLiteDatabase.execSQL(f55726c);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
                        break;
                    default:
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
                        break;
                }
                i3++;
            }
            return;
        }
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("Migration from ", i3, " to ", i10, " was requested, but cannot be performed. Only ");
        m10.append(list.size());
        m10.append(" migrations are provided");
        throw new IllegalArgumentException(m10.toString());
    }

    @Override
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f55729b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f55729b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f55728a);
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f55729b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f55729b) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        if (!this.f55729b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i3, i10);
    }
}
