package pf;

import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.cn0;

public final class n implements Runnable {

    public final int f45883a;

    public final z f45884b;

    public final long f45885c;

    public n(cn0 cn0Var, long j10, int i10) {
        this.f45883a = i10;
        this.f45884b = cn0Var;
        this.f45885c = j10;
    }

    @Override
    public final void run() {
        switch (this.f45883a) {
            case 0:
                long j10 = this.f45885c;
                z zVar = this.f45884b;
                zVar.getClass();
                try {
                    MessagesStorage.getInstance(zVar.f45996o0).getDatabase().executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                long j11 = this.f45885c;
                z zVar2 = this.f45884b;
                zVar2.getClass();
                try {
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast = MessagesStorage.getInstance(zVar2.f45996o0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, j11);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    sQLitePreparedStatementExecuteFast.step();
                    sQLitePreparedStatementExecuteFast.dispose();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }
}
