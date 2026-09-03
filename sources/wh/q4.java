package wh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class q4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49986a;
    public final d3 f49987b;
    public MessageObject f49988c;
    public VideoEditedInfo d;
    public String f49989e;
    public boolean f49990f;
    public boolean h;
    public boolean f49991n;

    public q4(int i10, MediaController.PhotoEntry photoEntry, d3 d3Var) {
        this.f49986a = i10;
        this.f49987b = d3Var;
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
        if (!this.f49991n && !this.h) {
            this.h = true;
            if (this.f49988c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f49988c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f49991n) {
            return;
        }
        this.f49991n = true;
        d();
        d3 d3Var = this.f49987b;
        r3 r3Var = d3Var.f49739c;
        IdentityHashMap identityHashMap = r3Var.X3;
        t tVar = d3Var.f49737a;
        identityHashMap.remove(tVar);
        tVar.f50066a = 3;
        r3Var.p4(d3Var.f49738b, tVar);
        r3Var.f50016e3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f49986a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d3 d3Var = this.f49987b;
        a aVar = d3Var.f49738b;
        t tVar = d3Var.f49737a;
        r3 r3Var = d3Var.f49739c;
        if (!this.h && !this.f49991n && i11 == this.f49986a && objArr.length != 0 && objArr[0] == this.f49988c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                tVar.f50070f = ((Float) objArr[4]).floatValue();
                View y12 = r3Var.y1(aVar);
                if (y12 instanceof o4) {
                    y12.requestLayout();
                    y12.invalidate();
                }
                if (longValue > 0) {
                    this.f49991n = true;
                    d();
                    String str = this.f49989e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    r3Var.X3.remove(tVar);
                    tVar.f50067b = true;
                    tVar.f50069e = str;
                    if (i12 > 0) {
                        tVar.f50073j = i12;
                    }
                    if (i13 > 0) {
                        tVar.f50074k = i13;
                    }
                    tVar.f50075l = 0;
                    tVar.f50076m = 0;
                    tVar.f50070f = 0.0f;
                    r3Var.m4(aVar);
                    r3Var.K4(d3Var.f49738b, tVar, str, true, tVar.f50073j, tVar.f50074k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
