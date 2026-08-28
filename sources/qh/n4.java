package qh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class n4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46542a;
    public final a3 f46543b;
    public MessageObject f46544c;
    public VideoEditedInfo d;
    public String f46545e;
    public boolean f46546f;
    public boolean h;
    public boolean f46547n;

    public n4(int i9, MediaController.PhotoEntry photoEntry, a3 a3Var) {
        this.f46542a = i9;
        this.f46543b = a3Var;
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
                for (int i9 = 0; i9 < size; i9++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i9);
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
        if (!this.f46547n && !this.h) {
            this.h = true;
            if (this.f46544c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f46544c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f46547n) {
            return;
        }
        this.f46547n = true;
        d();
        a3 a3Var = this.f46543b;
        o3 o3Var = a3Var.f46293c;
        IdentityHashMap identityHashMap = o3Var.W3;
        s sVar = a3Var.f46291a;
        identityHashMap.remove(sVar);
        sVar.f46668a = 3;
        o3Var.q4(a3Var.f46292b, sVar);
        o3Var.f46565d3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46542a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        a3 a3Var = this.f46543b;
        a aVar = a3Var.f46292b;
        s sVar = a3Var.f46291a;
        o3 o3Var = a3Var.f46293c;
        if (!this.h && !this.f46547n && i10 == this.f46542a && objArr.length != 0 && objArr[0] == this.f46544c) {
            if (i9 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f46672f = ((Float) objArr[4]).floatValue();
                View z12 = o3Var.z1(aVar);
                if (z12 instanceof l4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f46547n = true;
                    d();
                    String str = this.f46545e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i11 = videoEditedInfo.resultWidth;
                    int i12 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    o3Var.W3.remove(sVar);
                    sVar.f46669b = true;
                    sVar.f46671e = str;
                    if (i11 > 0) {
                        sVar.f46675j = i11;
                    }
                    if (i12 > 0) {
                        sVar.f46676k = i12;
                    }
                    sVar.f46677l = 0;
                    sVar.f46678m = 0;
                    sVar.f46672f = 0.0f;
                    o3Var.n4(aVar);
                    o3Var.L4(a3Var.f46292b, sVar, str, true, sVar.f46675j, sVar.f46676k, ceil);
                }
            } else if (i9 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
