package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements fs {
    public final int f53392b;
    public final Runnable f53393c;
    public final String d;
    public boolean f53395f;
    public boolean h;
    public boolean f53396n;
    public final ArrayList f53391a = new ArrayList();
    public final int f53394e = ConnectionsManager.generateClassGuid();

    public i(String str, int i7, Runnable runnable) {
        this.f53392b = i7;
        this.d = str;
        this.f53393c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i7 = this.f53392b;
            ks.f(i7).c(this, ks.V);
            ks.f(i7).c(this, ks.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f53391a;
            if (i7 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((fj) arrayList2.get(i7)).e1()))) {
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
        int i7 = this.f53392b;
        ks.f(i7).n(this, ks.V);
        ks.f(i7).n(this, ks.H1);
        ConnectionsManager.getInstance(i7).cancelRequestsForGuid(this.f53394e);
        this.f53396n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i7;
        if (!this.f53396n && !this.f53395f) {
            this.f53396n = true;
            int i10 = this.f53392b;
            long e10 = i10.i(i10).e();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f53391a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((fj) arrayList.get(i11)).e1());
                i11++;
            }
            ri d02 = ri.d0(i10);
            if (arrayList.isEmpty()) {
                i7 = 30;
            } else {
                i7 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            d02.Q0(e10, i7, i12, 0, 3, 0L, 1, this.f53394e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.V;
        ArrayList arrayList = this.f53391a;
        if (i7 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f53394e) {
                this.f53396n = false;
                this.f53395f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f53393c.run();
            }
        } else if (i7 == ks.H1) {
            arrayList.add(0, (fj) objArr[0]);
        }
    }
}
