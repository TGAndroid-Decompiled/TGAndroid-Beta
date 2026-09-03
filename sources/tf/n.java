package tf;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.vn0;
public final class n implements Runnable {
    public final int f44865a;
    public final z f44866b;
    public final long f44867c;

    public n(vn0 vn0Var, long j10, int i10) {
        this.f44865a = i10;
        this.f44866b = vn0Var;
        this.f44867c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44865a) {
            case 0:
                long j10 = this.f44867c;
                z zVar = this.f44866b;
                zVar.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(zVar.f44970p0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                long j11 = this.f44867c;
                z zVar2 = this.f44866b;
                zVar2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(zVar2.f44970p0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
