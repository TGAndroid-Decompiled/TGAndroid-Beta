package sf;

import android.content.DialogInterface;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c2;
import th.h3;
import th.m3;
import th.p3;
public final class p1 implements Runnable {
    public final int f47924a;
    public final int f47925b;
    public final Object f47926c;

    public p1(Object obj, int i10, int i11) {
        this.f47924a = i11;
        this.f47926c = obj;
        this.f47925b = i10;
    }

    @Override
    public final void run() {
        switch (this.f47924a) {
            case 0:
                MessagesStorage messagesStorage = (MessagesStorage) this.f47926c;
                int i10 = this.f47925b;
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i10).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                f2.o0 o0Var = (f2.o0) this.f47926c;
                int i11 = this.f47925b;
                o0Var.getClass();
                try {
                    o0Var.f6453a.scrollBy(0, i11);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 2:
                th.b0 b0Var = (th.b0) this.f47926c;
                th.e0 e0Var = b0Var.f48361f;
                if (b0Var.f48359c && e0Var.A != null && e0Var.f48892a != null) {
                    b0Var.d = true;
                    b0Var.f48357a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    th.c0 c0Var = e0Var.A;
                    th.a aVar = e0Var.f48892a;
                    p3 p3Var = ((h3) c0Var).f48481a;
                    p3Var.o3(false);
                    p3Var.f48638d3.Q0(new m3(p3Var, aVar, this.f47925b), b0Var);
                    return;
                }
                return;
            case 3:
                c2[] c2VarArr = (c2[]) this.f47926c;
                final int i12 = this.f47925b;
                c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    try {
                        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        c2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            default:
                ((yg.a) this.f47926c).v0(this.f47925b, 0, null);
                return;
        }
    }
}
