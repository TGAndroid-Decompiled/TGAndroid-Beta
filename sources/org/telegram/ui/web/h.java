package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.ConnectionsManager;
public final class h implements vs {
    public final int f42851b;
    public final Runnable f42852c;
    public final String d;
    public boolean f42853f;
    public boolean h;
    public boolean f42854n;
    public final ArrayList f42850a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public h(String str, int i10, Runnable runnable) {
        this.f42851b = i10;
        this.d = str;
        this.f42852c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i10 = this.f42851b;
            at.f(i10).c(this, at.V);
            at.f(i10).c(this, at.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42850a;
            if (i10 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((kj) arrayList2.get(i10)).f1()))) {
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
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
        int i10 = this.f42851b;
        at.f(i10).n(this, at.V);
        at.f(i10).n(this, at.H1);
        ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.e);
        this.f42854n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i10;
        if (!this.f42854n && !this.f42853f) {
            this.f42854n = true;
            int i11 = this.f42851b;
            long e = e20.i(i11).e();
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f42850a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                i13 = Math.min(i13, ((kj) arrayList.get(i12)).f1());
                i12++;
            }
            vi b02 = vi.b0(i11);
            if (arrayList.isEmpty()) {
                i10 = 30;
            } else {
                i10 = 50;
            }
            if (i13 == Integer.MAX_VALUE) {
                i13 = 0;
            }
            b02.N0(e, i10, i13, 0, 3, 0L, 1, this.e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.V;
        ArrayList arrayList = this.f42850a;
        if (i10 == i12) {
            if (((Integer) objArr[3]).intValue() == this.e) {
                this.f42854n = false;
                this.f42853f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f42852c.run();
            }
        } else if (i10 == at.H1) {
            arrayList.add(0, (kj) objArr[0]);
        }
    }
}
