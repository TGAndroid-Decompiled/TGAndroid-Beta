package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class r4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46191a;
    public final e3 f46192b;
    public MessageObject f46193c;
    public VideoEditedInfo d;
    public String e;
    public boolean f46194f;
    public boolean h;
    public boolean f46195n;

    public r4(int i10, MediaController.PhotoEntry photoEntry, e3 e3Var) {
        this.f46191a = i10;
        this.f46192b = e3Var;
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
        if (!this.f46195n && !this.h) {
            this.h = true;
            if (this.f46193c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f46193c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f46195n) {
            return;
        }
        this.f46195n = true;
        d();
        e3 e3Var = this.f46192b;
        s3 s3Var = e3Var.f45955c;
        IdentityHashMap identityHashMap = s3Var.X3;
        t tVar = e3Var.f45953a;
        identityHashMap.remove(tVar);
        tVar.f46247a = 3;
        s3Var.p4(e3Var.f45954b, tVar);
        s3Var.f46209e3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46191a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e3 e3Var = this.f46192b;
        a aVar = e3Var.f45954b;
        t tVar = e3Var.f45953a;
        s3 s3Var = e3Var.f45955c;
        if (!this.h && !this.f46195n && i11 == this.f46191a && objArr.length != 0 && objArr[0] == this.f46193c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f46250f = ((Float) objArr[4]).floatValue();
                View y12 = s3Var.y1(aVar);
                if (y12 instanceof p4) {
                    y12.requestLayout();
                    y12.invalidate();
                }
                if (longValue > 0) {
                    this.f46195n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    s3Var.X3.remove(tVar);
                    tVar.f46248b = true;
                    tVar.e = str;
                    if (i12 > 0) {
                        tVar.f46253j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f46254k = i13;
                    }
                    tVar.f46255l = 0;
                    tVar.f46256m = 0;
                    tVar.f46250f = 0.0f;
                    s3Var.m4(aVar);
                    s3Var.K4(e3Var.f45954b, tVar, str, true, tVar.f46253j, tVar.f46254k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
