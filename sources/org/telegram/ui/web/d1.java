package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.r91;
import xh.v5;
import xh.z7;
import zh.i4;
import zh.i5;
public final class d1 implements Runnable {
    public final int f37919a;

    public d1(int i10) {
        this.f37919a = i10;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f37919a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j3 = 0; j3 < readInt64; j3++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList.add(tLObject);
                            longSparseArray.put(tLObject.f37926a, tLObject);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new r91(26, arrayList, longSparseArray));
                return;
            case 1:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = f1.f37934c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = f1.f37934c;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((e1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = f1.f37934c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((e1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 2:
                return;
            case 3:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 4:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 5:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                return;
            case 6:
                float[] fArr = qg.a2.U;
                return;
            case 7:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f4724a;
                return;
            case 8:
                sg.p1.e0(0, null);
                return;
            case 9:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ?? obj3 = new Object();
                    obj3.f18485a = true;
                    R.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj3);
                    return;
                }
                return;
            case 10:
                a5.a aVar = xf.e.B;
                if (aVar != null) {
                    ArrayList arrayList4 = null;
                    while (i10 < xf.e.f45111y) {
                        if (((Bitmap[]) aVar.d)[i10] != null) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(((Bitmap[]) aVar.d)[i10]);
                        }
                        ((Bitmap[]) aVar.d)[i10] = null;
                        ((xf.a0[]) aVar.f276c)[i10] = null;
                        i10++;
                    }
                    if (!arrayList4.isEmpty()) {
                        Utilities.globalQueue.postRunnable(new og.h0(arrayList4, 1));
                    }
                    xf.e.B = null;
                    return;
                }
                return;
            case 11:
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new z7());
                    return;
                }
                return;
            case 13:
                v5[][] v5VarArr = v5.S;
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 15:
                return;
            case 16:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
                return;
            case 17:
                zh.x0.j();
                return;
            case 18:
                zh.x0 x0Var = zh.x0.Z;
                x0Var.e.invalidate();
                if (!x0Var.e.isInLayout()) {
                    x0Var.e.requestLayout();
                    x0Var.d.requestLayout();
                    x0Var.f49028f.requestLayout();
                    return;
                }
                return;
            case 19:
                int i13 = i4.h;
                return;
            default:
                Comparator comparator = i5.X;
                return;
        }
    }

    public d1(Object obj, int i10) {
        this.f37919a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
