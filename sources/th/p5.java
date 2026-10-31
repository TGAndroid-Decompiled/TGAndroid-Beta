package th;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements Runnable {
    public final int f49369a;
    public final Object f49370b;
    public final long f49371c;
    public final Object d;

    public p5(Object obj, long j10, Object obj2, int i10) {
        this.f49369a = i10;
        this.f49370b = obj;
        this.f49371c = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f49369a) {
            case 0:
                ((r5) this.f49370b).l(this.f49371c, (TL_stories.StoryItem) this.d);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                long j10 = this.f49371c;
                hs hsVar = ((r5) this.f49370b).f49412b;
                SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                try {
                    String join = TextUtils.join(", ", arrayList);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            case 2:
                ((View) this.d).invalidate();
                vp.r1(((v5) this.f49370b).f49544a).O1().h0(this.f49371c, false);
                return;
            case 3:
                vh.r6 r6Var = (vh.r6) this.f49370b;
                r6Var.getClass();
                r6Var.e(this.f49371c, ((TLRPC.ChatFull) this.d).participants);
                return;
            default:
                ((long[]) this.f49370b)[0] = this.f49371c;
                ((i2.g1) this.d).run();
                return;
        }
    }

    public p5(Object obj, Object obj2, long j10, int i10) {
        this.f49369a = i10;
        this.f49370b = obj;
        this.d = obj2;
        this.f49371c = j10;
    }
}
