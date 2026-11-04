package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements cs {
    public final int f50907b;
    public final Runnable f50908c;
    public final String d;
    public boolean f50910f;
    public boolean h;
    public boolean f50911n;
    public final ArrayList f50906a = new ArrayList();
    public final int f50909e = ConnectionsManager.generateClassGuid();

    public j(String str, int i3, Runnable runnable) {
        this.f50907b = i3;
        this.d = str;
        this.f50908c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i3 = this.f50907b;
            hs.f(i3).c(this, hs.V);
            hs.f(i3).c(this, hs.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f50906a;
            if (i3 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((zi) arrayList2.get(i3)).f1()))) {
                    arrayList2.remove(i3);
                    i3--;
                }
                i3++;
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
        int i3 = this.f50907b;
        hs.f(i3).n(this, hs.V);
        hs.f(i3).n(this, hs.H1);
        ConnectionsManager.getInstance(i3).cancelRequestsForGuid(this.f50909e);
        this.f50911n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i3;
        if (!this.f50911n && !this.f50910f) {
            this.f50911n = true;
            int i10 = this.f50907b;
            long e10 = h10.i(i10).e();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f50906a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((zi) arrayList.get(i11)).f1());
                i11++;
            }
            li b02 = li.b0(i10);
            if (arrayList.isEmpty()) {
                i3 = 30;
            } else {
                i3 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            b02.N0(e10, i3, i12, 0, 3, 0L, 1, this.f50909e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.V;
        ArrayList arrayList = this.f50906a;
        if (i3 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f50909e) {
                this.f50911n = false;
                this.f50910f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f50908c.run();
            }
        } else if (i3 == hs.H1) {
            arrayList.add(0, (zi) objArr[0]);
        }
    }
}
