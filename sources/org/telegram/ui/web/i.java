package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class i implements NotificationCenter.NotificationCenterDelegate {
    public final int f43887b;
    public final Runnable f43888c;
    public final String d;
    public boolean f43890f;
    public boolean h;
    public boolean f43891n;
    public final ArrayList f43886a = new ArrayList();
    public final int f43889e = ConnectionsManager.generateClassGuid();

    public i(String str, int i9, Runnable runnable) {
        this.f43887b = i9;
        this.d = str;
        this.f43888c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i9 = this.f43887b;
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.bookmarkAdded);
            if (TextUtils.isEmpty(this.d)) {
                d();
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f43886a;
            if (i9 < arrayList2.size()) {
                if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i9)).getId()))) {
                    arrayList2.remove(i9);
                    i9--;
                }
                i9++;
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
        int i9 = this.f43887b;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.bookmarkAdded);
        ConnectionsManager.getInstance(i9).cancelRequestsForGuid(this.f43889e);
        this.f43891n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i9;
        if (!this.f43891n && !this.f43890f) {
            this.f43891n = true;
            int i10 = this.f43887b;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f43886a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                i12 = Math.min(i12, ((MessageObject) arrayList.get(i11)).getId());
                i11++;
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            if (arrayList.isEmpty()) {
                i9 = 30;
            } else {
                i9 = 50;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = 0;
            }
            mediaDataController.loadMedia(clientUserId, i9, i12, 0, 3, 0L, 1, this.f43889e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.f43886a;
        if (i9 == i11) {
            if (((Integer) objArr[3]).intValue() == this.f43889e) {
                this.f43891n = false;
                this.f43890f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f43888c.run();
            }
        } else if (i9 == NotificationCenter.bookmarkAdded) {
            arrayList.add(0, (MessageObject) objArr[0]);
        }
    }
}
