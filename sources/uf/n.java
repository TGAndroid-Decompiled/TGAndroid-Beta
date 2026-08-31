package uf;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.xn0;
public final class n implements Runnable {
    public final int f48655a;
    public final z f48656b;
    public final long f48657c;

    public n(xn0 xn0Var, long j10, int i10) {
        this.f48655a = i10;
        this.f48656b = xn0Var;
        this.f48657c = j10;
    }

    @Override
    public final void run() {
        switch (this.f48655a) {
            case 0:
                long j10 = this.f48657c;
                z zVar = this.f48656b;
                zVar.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(zVar.f48769p0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                long j11 = this.f48657c;
                z zVar2 = this.f48656b;
                zVar2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(zVar2.f48769p0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
