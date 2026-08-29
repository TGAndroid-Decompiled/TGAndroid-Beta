package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
public final class j implements NotificationCenter.NotificationCenterDelegate {
    public final int f44070b;
    public final Runnable f44071c;
    public final String d;
    public boolean f44073f;
    public boolean h;
    public boolean f44074n;
    public final ArrayList f44069a = new ArrayList();
    public final int f44072e = ConnectionsManager.generateClassGuid();

    public j(String str, int i10, Runnable runnable) {
        this.f44070b = i10;
        this.d = str;
        this.f44071c = runnable;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            int i10 = this.f44070b;
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
            ArrayList arrayList2 = this.f44069a;
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
        int i10 = this.f44070b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.bookmarkAdded);
        ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.f44072e);
        this.f44074n = false;
    }

    public final void d() {
        ArrayList arrayList;
        int i10;
        if (!this.f44074n && !this.f44073f) {
            this.f44074n = true;
            int i11 = this.f44070b;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            int i12 = 0;
            int i13 = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.f44069a;
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
            mediaDataController.loadMedia(clientUserId, i10, i13, 0, 3, 0L, 1, this.f44072e, 0, null, this.d);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.f44069a;
        if (i10 == i12) {
            if (((Integer) objArr[3]).intValue() == this.f44072e) {
                this.f44074n = false;
                this.f44073f = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll((ArrayList) objArr[2]);
                this.f44071c.run();
            }
        } else if (i10 == NotificationCenter.bookmarkAdded) {
            arrayList.add(0, (MessageObject) objArr[0]);
        }
    }
}
