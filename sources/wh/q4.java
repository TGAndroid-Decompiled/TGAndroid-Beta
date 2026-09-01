package wh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class q4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49950a;
    public final d3 f49951b;
    public MessageObject f49952c;
    public VideoEditedInfo d;
    public String f49953e;
    public boolean f49954f;
    public boolean h;
    public boolean f49955n;

    public q4(int i10, MediaController.PhotoEntry photoEntry, d3 d3Var) {
        this.f49950a = i10;
        this.f49951b = d3Var;
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
        if (!this.f49955n && !this.h) {
            this.h = true;
            if (this.f49952c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f49952c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f49955n) {
            return;
        }
        this.f49955n = true;
        d();
        d3 d3Var = this.f49951b;
        r3 r3Var = d3Var.f49703c;
        IdentityHashMap identityHashMap = r3Var.X3;
        t tVar = d3Var.f49701a;
        identityHashMap.remove(tVar);
        tVar.f50030a = 3;
        r3Var.q4(d3Var.f49702b, tVar);
        r3Var.f49980e3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f49950a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d3 d3Var = this.f49951b;
        a aVar = d3Var.f49702b;
        t tVar = d3Var.f49701a;
        r3 r3Var = d3Var.f49703c;
        if (!this.h && !this.f49955n && i11 == this.f49950a && objArr.length != 0 && objArr[0] == this.f49952c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f50034f = ((Float) objArr[4]).floatValue();
                View z12 = r3Var.z1(aVar);
                if (z12 instanceof o4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f49955n = true;
                    d();
                    String str = this.f49953e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    r3Var.X3.remove(tVar);
                    tVar.f50031b = true;
                    tVar.f50033e = str;
                    if (i12 > 0) {
                        tVar.f50037j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f50038k = i13;
                    }
                    tVar.f50039l = 0;
                    tVar.f50040m = 0;
                    tVar.f50034f = 0.0f;
                    r3Var.n4(aVar);
                    r3Var.L4(d3Var.f49702b, tVar, str, true, tVar.f50037j, tVar.f50038k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
