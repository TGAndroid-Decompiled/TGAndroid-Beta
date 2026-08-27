package rh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

public final class o4 implements NotificationCenter.NotificationCenterDelegate {

    public final int f47316a;

    public final b3 f47317b;

    public MessageObject f47318c;
    public VideoEditedInfo d;

    public String f47319e;

    public boolean f47320f;
    public boolean h;

    public boolean f47321n;

    public o4(int i10, MediaController.PhotoEntry photoEntry, b3 b3Var) {
        this.f47316a = i10;
        this.f47317b = b3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = photoEntry.croppedMediaEntities;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = (arrayList == null || arrayList.isEmpty()) ? photoEntry.mediaEntities : photoEntry.croppedMediaEntities;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList2.get(i10);
                    if (mediaEntity != null) {
                        if (mediaEntity.type == 0) {
                            byte b10 = mediaEntity.subType;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (this.f47321n || this.h) {
            return;
        }
        this.h = true;
        if (this.f47318c != null && this.d != null) {
            try {
                MediaController.getInstance().cancelVideoConvert(this.f47318c);
            } catch (Throwable unused) {
            }
        }
        d();
    }

    public final void b() {
        if (this.f47321n) {
            return;
        }
        this.f47321n = true;
        d();
        b3 b3Var = this.f47317b;
        p3 p3Var = b3Var.f47070c;
        IdentityHashMap identityHashMap = p3Var.W3;
        s sVar = b3Var.f47068a;
        identityHashMap.remove(sVar);
        sVar.f47414a = 3;
        p3Var.q4(b3Var.f47069b, sVar);
        p3Var.f47340d3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f47316a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b3 b3Var = this.f47317b;
        a aVar = b3Var.f47069b;
        s sVar = b3Var.f47068a;
        p3 p3Var = b3Var.f47070c;
        if (this.h || this.f47321n || i11 != this.f47316a || objArr.length == 0 || objArr[0] != this.f47318c) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed) {
                b();
                return;
            }
            return;
        }
        long jLongValue = ((Long) objArr[3]).longValue();
        sVar.f47418f = ((Float) objArr[4]).floatValue();
        View viewZ1 = p3Var.z1(aVar);
        if (viewZ1 instanceof m4) {
            viewZ1.requestLayout();
            viewZ1.invalidate();
        }
        if (jLongValue > 0) {
            this.f47321n = true;
            d();
            String str = this.f47319e;
            VideoEditedInfo videoEditedInfo = this.d;
            int i12 = videoEditedInfo.resultWidth;
            int i13 = videoEditedInfo.resultHeight;
            int iCeil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
            p3Var.W3.remove(sVar);
            sVar.f47415b = true;
            sVar.f47417e = str;
            if (i12 > 0) {
                sVar.f47421j = i12;
            }
            if (i13 > 0) {
                sVar.f47422k = i13;
            }
            sVar.f47423l = 0;
            sVar.f47424m = 0;
            sVar.f47418f = 0.0f;
            p3Var.n4(aVar);
            p3Var.L4(b3Var.f47069b, sVar, str, true, sVar.f47421j, sVar.f47422k, iCeil);
        }
    }
}
