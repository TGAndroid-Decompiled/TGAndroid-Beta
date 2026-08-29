package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class g2 implements Runnable {
    public final int f44042a;
    public final k2 f44043b;

    public g2(k2 k2Var, int i10) {
        this.f44042a = i10;
        this.f44043b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f44042a) {
            case 0:
                final k2 k2Var = this.f44043b;
                if (!k2Var.d) {
                    k2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (j2 j2Var : k2Var.f44092a.values()) {
                        if (!TextUtils.isEmpty(j2Var.f44077b) && currentTimeMillis - j2Var.f44076a <= 604800000) {
                            arrayList.add(0, j2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k2 k2Var2 = k2Var;
                                                k2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        j2 j2Var2 = (j2) arrayList2.get(i10);
                                                        k2Var2.f44092a.put(j2Var2.f44077b, j2Var2);
                                                        i10++;
                                                    } else {
                                                        k2Var2.f44093b = true;
                                                        k2Var2.f44094c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                k2 k2Var3 = k2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        k2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                i2 i2Var = new i2();
                                                i2Var.f44068a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(i2Var.getObjectSize());
                                                i2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    k2 k2Var2 = k2Var;
                                    k2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            j2 j2Var2 = (j2) arrayList2.get(i10);
                                            k2Var2.f44092a.put(j2Var2.f44077b, j2Var2);
                                            i10++;
                                        } else {
                                            k2Var2.f44093b = true;
                                            k2Var2.f44094c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    k2 k2Var3 = k2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            k2Var3.d = false;
                                            return;
                                        }
                                    }
                                    i2 i2Var = new i2();
                                    i2Var.f44068a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(i2Var.getObjectSize());
                                    i2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final k2 k2Var2 = this.f44043b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    k2Var2.f44093b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    i2 i2Var = new i2();
                    i2Var.readParams(serializedData, true);
                    arrayList2.addAll(i2Var.f44068a);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                k2 k2Var22 = k2Var2;
                                k2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        j2 j2Var2 = (j2) arrayList22.get(i10);
                                        k2Var22.f44092a.put(j2Var2.f44077b, j2Var2);
                                        i10++;
                                    } else {
                                        k2Var22.f44093b = true;
                                        k2Var22.f44094c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                k2 k2Var3 = k2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        FileLog.e(e102);
                                        k2Var3.d = false;
                                        return;
                                    }
                                }
                                i2 i2Var2 = new i2();
                                i2Var2.f44068a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(i2Var2.getObjectSize());
                                i2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                AndroidUtilities.runOnUIThread(new g2(k2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f44043b.d = false;
                return;
        }
    }
}
