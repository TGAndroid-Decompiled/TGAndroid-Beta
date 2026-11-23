package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements gs {
    public final int f53157b;
    public final Runnable f53158c;
    public final String d;
    public boolean f53160f;
    public boolean h;
    public boolean f53161n;
    public final ArrayList f53156a = new ArrayList();
    public final int f53159e = ConnectionsManager.generateClassGuid();

    public i(String str, int i7, Runnable runnable) {
        this.f53157b = i7;
        this.d = str;
        this.f53158c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i7 = this.f53157b;
            ls.f(i7).c(this, ls.V);
            ls.f(i7).c(this, ls.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f53156a;
            if (i7 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((gj) arrayList2.get(i7)).e1()))) {
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
        int i7 = this.f53157b;
        ls.f(i7).n(this, ls.V);
        ls.f(i7).n(this, ls.H1);
        ConnectionsManager.getInstance(i7).cancelRequestsForGuid(this.f53159e);
        this.f53161n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i7;
        if (!this.f53161n && !this.f53160f) {
            this.f53161n = true;
            int i10 = this.f53157b;
            long e10 = k10.i(i10).e();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f53156a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((gj) arrayList.get(i11)).e1());
                i11++;
            }
            si d02 = si.d0(i10);
            if (arrayList.isEmpty()) {
                i7 = 30;
            } else {
                i7 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            d02.Q0(e10, i7, i12, 0, 3, 0L, 1, this.f53159e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.V;
        ArrayList arrayList = this.f53156a;
        if (i7 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f53159e) {
                this.f53161n = false;
                this.f53160f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f53158c.run();
            }
        } else if (i7 == ls.H1) {
            arrayList.add(0, (gj) objArr[0]);
        }
    }
}
