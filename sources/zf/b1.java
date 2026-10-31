package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.oa;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.un;
import th.r4;
public final class b1 extends sk0 implements us {
    public r4 D;
    public final Context f55444c;
    public final un f55445f;
    public int h;
    public int f55446n;
    public final p6 f55448s;
    public final int f55449w;
    public final boolean f55450x;
    public String f55451y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int f55447r = d20.f15147s0;
    public final xh.d0 E = new xh.d0(this, 8);

    public b1(Context context, un unVar, p6 p6Var, int i10, boolean z10) {
        this.f55448s = p6Var;
        this.f55444c = context;
        this.f55445f = unVar;
        this.f55449w = i10;
        this.f55450x = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int b() {
        return this.e.size() + this.f55446n;
    }

    @Override
    public final int d(int i10) {
        if (i10 < this.e.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19723x5 && objArr[0] == this.D) {
            f();
        }
    }

    @Override
    public final void f() {
        ArrayList arrayList;
        int b10 = b();
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i10 = this.f55447r;
        int i11 = this.f55449w;
        if (i11 == 0) {
            arrayList = ui.b0(i10).Y0;
        } else {
            arrayList = oa.a(i10).b(i11).f17068a;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            jj jjVar = (jj) arrayList.get(i13);
            if ((!jjVar.z2() || jjVar.N2) && !hashSet.contains(Integer.valueOf(jjVar.f1()))) {
                arrayList2.add(jjVar);
                hashSet.add(Integer.valueOf(jjVar.f1()));
            }
        }
        int i14 = this.f55446n;
        this.h = arrayList2.size();
        if (i11 != 0) {
            if (!oa.a(i10).b(i11).f17078n && this.h != 0) {
                i12 = Utilities.j(oa.a(i10).b(i11).f17077m - this.h, 3, 0);
            }
            this.f55446n = i12;
        } else {
            if (!ui.b0(i10).W1() && this.h != 0) {
                i12 = Utilities.j(ui.b0(i10).j0() - this.h, 3, 0);
            }
            this.f55446n = i12;
        }
        int b11 = b();
        if (b10 < b11) {
            if (i14 > 0) {
                k(b10 - i14, i14);
            }
            o(b10, b11 - b10);
            return;
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i13 == 0) {
            v2 v2Var = (v2) view;
            v2Var.f23265s2 = true;
            jj jjVar = (jj) E(i10);
            long B0 = jj.B0(jjVar.f16337k);
            int i14 = jjVar.f16337k.date;
            if (this.f55450x) {
                v2Var.f23257r0 = true;
                long Q1 = jjVar.Q1();
                TLRPC.Message message = jjVar.f16337k;
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                if (messageFwdHeader != null && ((i11 = messageFwdHeader.date) != 0 || messageFwdHeader.saved_date != 0)) {
                    if (i11 == 0) {
                        i12 = messageFwdHeader.saved_date;
                    }
                    z10 = false;
                    B0 = Q1;
                } else {
                    i12 = message.date;
                }
                i11 = i12;
                z10 = false;
                B0 = Q1;
            } else {
                if (jjVar.P3() || w3.o0(this.f55447r, B0)) {
                    B0 = jjVar.Z0();
                }
                z10 = true;
                i11 = i14;
            }
            v2Var.d0(B0, jjVar, i11, z10, false);
            v2Var.setDialogCellDelegate(new y0(this));
        } else if (i13 == 2) {
            ((a1) view).a(this.D);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View v2Var;
        zz zzVar;
        if (i10 != 0) {
            p6 p6Var = this.f55448s;
            Context context = this.f55444c;
            if (i10 != 1) {
                if (i10 != 2) {
                    v2Var = null;
                } else {
                    zzVar = new a1(context, p6Var);
                }
            } else {
                zz zzVar2 = new zz(context, p6Var);
                zzVar2.setIsSingleCell(true);
                zzVar2.setViewType(7);
                zzVar = zzVar2;
            }
            v2Var = zzVar;
        } else {
            v2Var = new v2(null, this.f55444c, true, this.f55447r, this.f55448s);
        }
        return sc.e.o(v2Var, v2Var, -1, -2);
    }
}
