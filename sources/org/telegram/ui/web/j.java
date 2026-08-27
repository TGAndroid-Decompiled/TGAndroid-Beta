package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;

public final class j implements NotificationCenter.NotificationCenterDelegate {

    public final int f43874b;

    public final Runnable f43875c;
    public final String d;

    public boolean f43877f;
    public boolean h;

    public boolean f43878n;

    public final ArrayList f43873a = new ArrayList();

    public final int f43876e = ConnectionsManager.generateClassGuid();

    public j(String str, int i10, Runnable runnable) {
        this.f43874b = i10;
        this.d = str;
        this.f43875c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i10 = this.f43874b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.bookmarkAdded);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f43873a;
            if (i10 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i10)).getId()))) {
                arrayList2.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i10 = this.f43874b;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.bookmarkAdded);
            ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.f43876e);
            this.f43878n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.f43878n || this.f43877f) {
            return;
        }
        this.f43878n = true;
        int i10 = this.f43874b;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        int i11 = 0;
        int iMin = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.f43873a;
            if (i11 >= arrayList.size()) {
                break;
            }
            iMin = Math.min(iMin, ((MessageObject) arrayList.get(i11)).getId());
            i11++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        int i12 = arrayList.isEmpty() ? 30 : 50;
        if (iMin == Integer.MAX_VALUE) {
            iMin = 0;
        }
        mediaDataController.loadMedia(clientUserId, i12, iMin, 0, 3, 0L, 1, this.f43876e, 0, null, this.d);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.mediaDidLoad;
        ArrayList arrayList = this.f43873a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.bookmarkAdded) {
                arrayList.add(0, (MessageObject) objArr[0]);
            }
        } else if (((Integer) objArr[3]).intValue() == this.f43876e) {
            this.f43878n = false;
            ArrayList arrayList2 = (ArrayList) objArr[2];
            this.f43877f = ((Boolean) objArr[5]).booleanValue();
            arrayList.addAll(arrayList2);
            this.f43875c.run();
        }
    }
}
