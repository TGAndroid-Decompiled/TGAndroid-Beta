package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
public final class h implements ls {
    public final int f51130b;
    public final Runnable f51131c;
    public final String d;
    public boolean f51133f;
    public boolean h;
    public boolean f51134n;
    public final ArrayList f51129a = new ArrayList();
    public final int f51132e = ConnectionsManager.generateClassGuid();

    public h(String str, int i7, Runnable runnable) {
        this.f51130b = i7;
        this.d = str;
        this.f51131c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i7 = this.f51130b;
            qs.f(i7).c(this, qs.V);
            qs.f(i7).c(this, qs.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f51129a;
            if (i7 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((ij) arrayList2.get(i7)).e1()))) {
                    arrayList2.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        if (!this.h) {
            return;
        }
        this.h = false;
        int i7 = this.f51130b;
        qs.f(i7).n(this, qs.V);
        qs.f(i7).n(this, qs.H1);
        ConnectionsManager.getInstance(i7).cancelRequestsForGuid(this.f51132e);
        this.f51134n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i7;
        if (!this.f51134n && !this.f51133f) {
            this.f51134n = true;
            int i10 = this.f51130b;
            long e10 = p10.i(i10).e();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f51129a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((ij) arrayList.get(i11)).e1());
                i11++;
            }
            ui b02 = ui.b0(i10);
            if (arrayList.isEmpty()) {
                i7 = 30;
            } else {
                i7 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            b02.N0(e10, i7, i12, 0, 3, 0L, 1, this.f51132e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.V;
        ArrayList arrayList = this.f51129a;
        if (i7 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f51132e) {
                this.f51134n = false;
                this.f51133f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f51131c.run();
            }
        } else if (i7 == qs.H1) {
            arrayList.add(0, (ij) objArr[0]);
        }
    }
}
