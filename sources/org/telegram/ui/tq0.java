package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

public final class tq0 implements Runnable {

    public final int f42996a;

    public tq0(int i10) {
        this.f42996a = i10;
    }

    @Override
    public final void run() throws Throwable {
        org.telegram.ui.Components.mc mcVarA0;
        org.telegram.ui.ActionBar.f6 f6VarN0;
        int i10 = 4;
        int i11 = 0;
        switch (this.f42996a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 1:
                org.telegram.ui.Components.mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 2:
                org.telegram.ui.Components.mc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null && (mcVarA0 = org.telegram.ui.Components.mc.a0(n2VarU)) != null) {
                    org.telegram.ui.Components.ec ecVarM = mcVarA0.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    ecVarM.f28020j = 5000;
                    ecVarM.j();
                }
                break;
            case 4:
                int i12 = i81.Z;
                break;
            case 5:
                org.telegram.ui.ActionBar.g6.N = false;
                org.telegram.ui.ActionBar.g6.E(false);
                break;
            case 6:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                }
                break;
            case 7:
                int[][] iArr = WallpapersListActivity.f36299g0;
                PhotoViewer.t1().G0(false, false);
                break;
            case 8:
                Utilities.globalQueue.postRunnable(new tq0(10));
                break;
            case 9:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long int64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < int64; j10++) {
                            org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1();
                            a1Var.readParams(serializedData, true);
                            arrayList.add(a1Var);
                            longSparseArray.put(a1Var.f43774a, a1Var);
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AndroidUtilities.runOnUIThread(new zh1(i10, arrayList, longSparseArray));
                break;
            case 10:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.b1.f43783c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.b1.f43783c;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        ((org.telegram.ui.web.a1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.b1.f43783c;
                    int size3 = arrayList3.size();
                    while (i11 < size3) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((org.telegram.ui.web.a1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 11:
            case 12:
                break;
            case 13:
                int i14 = ph.g.B;
                break;
            case 14:
                qf.q1[] q1VarArr = qf.q1.f46432g;
                break;
            case 15:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.C1.f35539v0.getRootView(), new j4.w0(18));
                break;
            case 16:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                    }
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
                    } else {
                        f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                    }
                    AndroidUtilities.runOnUIThread(new qf.b(f6VarN0, 16), 200L);
                } else {
                    str2 = string2;
                }
                str = string;
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                } else {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str);
                }
                AndroidUtilities.runOnUIThread(new qf.b(f6VarN0, 16), 200L);
                break;
            case 17:
                yf.i0.b();
                break;
            case 18:
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 19:
                Looper looperMyLooper2 = Looper.myLooper();
                if (looperMyLooper2 != null) {
                    looperMyLooper2.quit();
                }
                break;
            default:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
        }
    }

    public tq0(Object obj, int i10) {
        this.f42996a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
