package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements is {
    public final int f52630b;
    public final Runnable f52631c;
    public final String d;
    public boolean f52633f;
    public boolean h;
    public boolean f52634n;
    public final ArrayList f52629a = new ArrayList();
    public final int f52632e = ConnectionsManager.generateClassGuid();

    public i(String str, int i7, Runnable runnable) {
        this.f52630b = i7;
        this.d = str;
        this.f52631c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i7 = this.f52630b;
            ns.f(i7).c(this, ns.V);
            ns.f(i7).c(this, ns.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52629a;
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
        int i7 = this.f52630b;
        ns.f(i7).n(this, ns.V);
        ns.f(i7).n(this, ns.H1);
        ConnectionsManager.getInstance(i7).cancelRequestsForGuid(this.f52632e);
        this.f52634n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i7;
        if (!this.f52634n && !this.f52633f) {
            this.f52634n = true;
            int i10 = this.f52630b;
            long e10 = m10.i(i10).e();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f52629a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((gj) arrayList.get(i11)).e1());
                i11++;
            }
            si b02 = si.b0(i10);
            if (arrayList.isEmpty()) {
                i7 = 30;
            } else {
                i7 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            b02.N0(e10, i7, i12, 0, 3, 0L, 1, this.f52632e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.V;
        ArrayList arrayList = this.f52629a;
        if (i7 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f52632e) {
                this.f52634n = false;
                this.f52633f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f52631c.run();
            }
        } else if (i7 == ns.H1) {
            arrayList.add(0, (gj) objArr[0]);
        }
    }
}
