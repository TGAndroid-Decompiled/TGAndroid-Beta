package th;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tk0;
public final class w7 {
    public static final w7[] f49592f = new w7[4];
    public final int f49593a;
    public final LongSparseLongArray f49594b = new LongSparseLongArray();
    public final ArrayList f49595c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final v7 e;

    public w7(int i10) {
        new ArrayList();
        this.e = new v7(this);
        this.f49593a = i10;
    }

    public final void a(tk0 tk0Var) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f49595c;
        arrayList.clear();
        for (int i10 = 0; i10 < tk0Var.getChildCount(); i10++) {
            View childAt = tk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                j10 = ((org.telegram.ui.Cells.v2) childAt).getDialogId();
            } else if (childAt instanceof pa) {
                j10 = ((pa) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i12 = this.f49593a;
            LongSparseLongArray longSparseLongArray = this.f49594b;
            if (i11 > 0) {
                TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(j10));
                if (Z1 != null && !Z1.bot && !Z1.self && !Z1.contact && (userStatus = Z1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            } else {
                TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-j10));
                if (org.telegram.messenger.w3.T(L0) && !org.telegram.messenger.w3.p0(L0) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            v7 v7Var = this.e;
            org.telegram.messenger.i0.r(v7Var);
            org.telegram.messenger.i0.h3(v7Var, 300L);
        }
    }
}
