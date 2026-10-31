package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
public final class h implements us {
    public final int f43049b;
    public final Runnable f43050c;
    public final String d;
    public boolean f43051f;
    public boolean h;
    public boolean f43052n;
    public final ArrayList f43048a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public h(String str, int i10, Runnable runnable) {
        this.f43049b = i10;
        this.d = str;
        this.f43050c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i10 = this.f43049b;
            zs.f(i10).c(this, zs.V);
            zs.f(i10).c(this, zs.H1);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f43048a;
            if (i10 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((jj) arrayList2.get(i10)).f1()))) {
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
        int i10 = this.f43049b;
        zs.f(i10).n(this, zs.V);
        zs.f(i10).n(this, zs.H1);
        ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.e);
        this.f43052n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i10;
        if (!this.f43052n && !this.f43051f) {
            this.f43052n = true;
            int i11 = this.f43049b;
            long e = d20.i(i11).e();
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f43048a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                i13 = Math.min(i13, ((jj) arrayList.get(i12)).f1());
                i12++;
            }
            ui b02 = ui.b0(i11);
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
        int i12 = zs.V;
        ArrayList arrayList = this.f43048a;
        if (i10 == i12) {
            if (((Integer) objArr[3]).intValue() == this.e) {
                this.f43052n = false;
                this.f43051f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f43050c.run();
            }
        } else if (i10 == zs.H1) {
            arrayList.add(0, (jj) objArr[0]);
        }
    }
}
