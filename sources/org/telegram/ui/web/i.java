package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements NotificationCenter.NotificationCenterDelegate {
    public final int f42545b;
    public final Runnable f42546c;
    public final String d;
    public boolean f42548f;
    public boolean h;
    public boolean f42549n;
    public final ArrayList f42544a = new ArrayList();
    public final int f42547e = ConnectionsManager.generateClassGuid();

    public i(String str, int i10, Runnable runnable) {
        this.f42545b = i10;
        this.d = str;
        this.f42546c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i10 = this.f42545b;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.bookmarkAdded);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42544a;
            if (i10 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i10)).getId()))) {
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
        int i10 = this.f42545b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.bookmarkAdded);
        ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.f42547e);
        this.f42549n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i10;
        if (!this.f42549n && !this.f42548f) {
            this.f42549n = true;
            int i11 = this.f42545b;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f42544a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                i13 = Math.min(i13, ((MessageObject) arrayList.get(i12)).getId());
                i12++;
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(i11);
            if (arrayList.isEmpty()) {
                i10 = 30;
            } else {
                i10 = 50;
            }
            if (i13 == Integer.MAX_VALUE) {
                i13 = 0;
            }
            mediaDataController.loadMedia(clientUserId, i10, i13, 0, 3, 0L, 1, this.f42547e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.f42544a;
        if (i10 == i12) {
            if (((Integer) objArr[3]).intValue() == this.f42547e) {
                this.f42549n = false;
                this.f42548f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f42546c.run();
            }
        } else if (i10 == NotificationCenter.bookmarkAdded) {
            arrayList.add(0, (MessageObject) objArr[0]);
        }
    }
}
