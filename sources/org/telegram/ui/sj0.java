package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
public final class sj0 implements Runnable {
    public final int f41255a;

    public sj0(int i10) {
        this.f41255a = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10 = 0;
        switch (this.f41255a) {
            case 0:
                org.telegram.ui.Components.qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Q8;
                return;
            case 2:
                org.telegram.ui.Components.qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 3:
                org.telegram.ui.Components.qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            case 4:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.qc.a0(U)) != null) {
                    org.telegram.ui.Components.ic M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.f27778j = 5000;
                    M.j();
                    return;
                }
                return;
            case 5:
                int i11 = f91.f36722a0;
                return;
            case 6:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.E(false);
                return;
            case 7:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 8:
                int[][] iArr = WallpapersListActivity.f34941h0;
                PhotoViewer.t1().G0(false, false);
                return;
            case 9:
                Utilities.globalQueue.postRunnable(new sj0(11));
                return;
            case 10:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            ?? tLObject = new TLObject();
                            tLObject.readParams(serializedData, true);
                            arrayList.add(tLObject);
                            longSparseArray.put(tLObject.f42472a, tLObject);
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new bh1(8, arrayList, longSparseArray));
                return;
            case 11:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.c1.f42477c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.c1.f42477c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.b1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.c1.f42477c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.b1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 12:
                return;
            case 13:
                int i13 = qh.y.f46321u0;
                return;
            case 14:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                return;
            case 16:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                return;
            case 17:
                HashSet hashSet = sh.p2.T0;
                return;
            case 18:
                return;
            case 19:
                int i14 = uh.g.C;
                return;
            default:
                vf.p1[] p1VarArr = vf.p1.f49206g;
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
