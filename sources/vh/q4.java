package vh;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class q4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46091a;
    public final d3 f46092b;
    public MessageObject f46093c;
    public VideoEditedInfo d;
    public String e;
    public boolean f46094f;
    public boolean h;
    public boolean f46095n;

    public q4(int i10, MediaController.PhotoEntry photoEntry, d3 d3Var) {
        this.f46091a = i10;
        this.f46092b = d3Var;
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
        if (!this.f46095n && !this.h) {
            this.h = true;
            if (this.f46093c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f46093c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f46095n) {
            return;
        }
        this.f46095n = true;
        d();
        d3 d3Var = this.f46092b;
        r3 r3Var = d3Var.f45858c;
        IdentityHashMap identityHashMap = r3Var.X3;
        s sVar = d3Var.f45856a;
        identityHashMap.remove(sVar);
        sVar.f46150a = 3;
        r3Var.q4(d3Var.f45857b, sVar);
        r3Var.f46112e3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46091a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d3 d3Var = this.f46092b;
        a aVar = d3Var.f45857b;
        s sVar = d3Var.f45856a;
        r3 r3Var = d3Var.f45858c;
        if (!this.h && !this.f46095n && i11 == this.f46091a && objArr.length != 0 && objArr[0] == this.f46093c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                sVar.f46153f = ((Float) objArr[4]).floatValue();
                View z12 = r3Var.z1(aVar);
                if (z12 instanceof o4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f46095n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    r3Var.X3.remove(sVar);
                    sVar.f46151b = true;
                    sVar.e = str;
                    if (i12 > 0) {
                        sVar.f46156j = i12;
                    }
                    if (i13 > 0) {
                        sVar.f46157k = i13;
                    }
                    sVar.f46158l = 0;
                    sVar.f46159m = 0;
                    sVar.f46153f = 0.0f;
                    r3Var.n4(aVar);
                    r3Var.L4(d3Var.f45857b, sVar, str, true, sVar.f46156j, sVar.f46157k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
