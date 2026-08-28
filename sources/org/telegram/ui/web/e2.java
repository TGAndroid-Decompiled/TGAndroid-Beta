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
public final class e2 implements Runnable {
    public final int f43847a;
    public final i2 f43848b;

    public e2(i2 i2Var, int i9) {
        this.f43847a = i9;
        this.f43848b = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f43847a) {
            case 0:
                final i2 i2Var = this.f43848b;
                if (!i2Var.d) {
                    i2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (h2 h2Var : i2Var.f43894a.values()) {
                        if (!TextUtils.isEmpty(h2Var.f43880b) && currentTimeMillis - h2Var.f43879a <= 604800000) {
                            arrayList.add(0, h2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                i2 i2Var2 = i2Var;
                                                i2Var2.getClass();
                                                int i9 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i9 < arrayList2.size()) {
                                                        h2 h2Var2 = (h2) arrayList2.get(i9);
                                                        i2Var2.f43894a.put(h2Var2.f43880b, h2Var2);
                                                        i9++;
                                                    } else {
                                                        i2Var2.f43895b = true;
                                                        i2Var2.f43896c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                i2 i2Var3 = i2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                        i2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                g2 g2Var = new g2();
                                                g2Var.f43864a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(g2Var.getObjectSize());
                                                g2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
                                                }
                                                AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
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
                                    i2 i2Var2 = i2Var;
                                    i2Var2.getClass();
                                    int i9 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i9 < arrayList2.size()) {
                                            h2 h2Var2 = (h2) arrayList2.get(i9);
                                            i2Var2.f43894a.put(h2Var2.f43880b, h2Var2);
                                            i9++;
                                        } else {
                                            i2Var2.f43895b = true;
                                            i2Var2.f43896c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    i2 i2Var3 = i2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            i2Var3.d = false;
                                            return;
                                        }
                                    }
                                    g2 g2Var = new g2();
                                    g2Var.f43864a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(g2Var.getObjectSize());
                                    g2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final i2 i2Var2 = this.f43848b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    i2Var2.f43895b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    g2 g2Var = new g2();
                    g2Var.readParams(serializedData, true);
                    arrayList2.addAll(g2Var.f43864a);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i2 i2Var22 = i2Var2;
                                i2Var22.getClass();
                                int i9 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i9 < arrayList22.size()) {
                                        h2 h2Var2 = (h2) arrayList22.get(i9);
                                        i2Var22.f43894a.put(h2Var2.f43880b, h2Var2);
                                        i9++;
                                    } else {
                                        i2Var22.f43895b = true;
                                        i2Var22.f43896c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                i2 i2Var3 = i2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        FileLog.e(e102);
                                        i2Var3.d = false;
                                        return;
                                    }
                                }
                                g2 g2Var2 = new g2();
                                g2Var2.f43864a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(g2Var2.getObjectSize());
                                g2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                AndroidUtilities.runOnUIThread(new e2(i2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f43848b.d = false;
                return;
        }
    }
}
