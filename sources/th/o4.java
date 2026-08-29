package th;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class o4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f48615a;
    public final b3 f48616b;
    public MessageObject f48617c;
    public VideoEditedInfo d;
    public String f48618e;
    public boolean f48619f;
    public boolean h;
    public boolean f48620n;

    public o4(int i10, MediaController.PhotoEntry photoEntry, b3 b3Var) {
        this.f48615a = i10;
        this.f48616b = b3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = photoEntry.croppedMediaEntities;
            } else {
                arrayList = photoEntry.mediaEntities;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i10);
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
        if (!this.f48620n && !this.h) {
            this.h = true;
            if (this.f48617c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f48617c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f48620n) {
            return;
        }
        this.f48620n = true;
        d();
        b3 b3Var = this.f48616b;
        p3 p3Var = b3Var.f48370c;
        IdentityHashMap identityHashMap = p3Var.W3;
        s sVar = b3Var.f48368a;
        identityHashMap.remove(sVar);
        sVar.f48712a = 3;
        p3Var.q4(b3Var.f48369b, sVar);
        p3Var.f48638d3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f48615a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b3 b3Var = this.f48616b;
        a aVar = b3Var.f48369b;
        s sVar = b3Var.f48368a;
        p3 p3Var = b3Var.f48370c;
        if (!this.h && !this.f48620n && i11 == this.f48615a && objArr.length != 0 && objArr[0] == this.f48617c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f48716f = ((Float) objArr[4]).floatValue();
                View z12 = p3Var.z1(aVar);
                if (z12 instanceof m4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f48620n = true;
                    d();
                    String str = this.f48618e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    p3Var.W3.remove(sVar);
                    sVar.f48713b = true;
                    sVar.f48715e = str;
                    if (i12 > 0) {
                        sVar.f48719j = i12;
                    }
                    if (i13 > 0) {
                        sVar.f48720k = i13;
                    }
                    sVar.f48721l = 0;
                    sVar.f48722m = 0;
                    sVar.f48716f = 0.0f;
                    p3Var.n4(aVar);
                    p3Var.L4(b3Var.f48369b, sVar, str, true, sVar.f48719j, sVar.f48720k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
