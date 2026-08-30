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
public final class h2 implements Runnable {
    public final int f39524a;
    public final l2 f39525b;

    public h2(l2 l2Var, int i10) {
        this.f39524a = i10;
        this.f39525b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f39524a) {
            case 0:
                final l2 l2Var = this.f39525b;
                if (!l2Var.d) {
                    l2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (k2 k2Var : l2Var.f39573a.values()) {
                        if (!TextUtils.isEmpty(k2Var.f39560b) && currentTimeMillis - k2Var.f39559a <= 604800000) {
                            arrayList.add(0, k2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                l2 l2Var2 = l2Var;
                                                l2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        k2 k2Var2 = (k2) arrayList2.get(i10);
                                                        l2Var2.f39573a.put(k2Var2.f39560b, k2Var2);
                                                        i10++;
                                                    } else {
                                                        l2Var2.f39574b = true;
                                                        l2Var2.f39575c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                l2 l2Var3 = l2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        l2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                j2 j2Var = new j2();
                                                j2Var.f39545a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(j2Var.getObjectSize());
                                                j2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e6) {
                                                    FileLog.e(e6);
                                                }
                                                AndroidUtilities.runOnUIThread(new h2(l2Var3, 2));
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
                                    l2 l2Var2 = l2Var;
                                    l2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            k2 k2Var2 = (k2) arrayList2.get(i10);
                                            l2Var2.f39573a.put(k2Var2.f39560b, k2Var2);
                                            i10++;
                                        } else {
                                            l2Var2.f39574b = true;
                                            l2Var2.f39575c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    l2 l2Var3 = l2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            l2Var3.d = false;
                                            return;
                                        }
                                    }
                                    j2 j2Var = new j2();
                                    j2Var.f39545a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(j2Var.getObjectSize());
                                    j2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                    AndroidUtilities.runOnUIThread(new h2(l2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final l2 l2Var2 = this.f39525b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    l2Var2.f39574b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    j2 j2Var = new j2();
                    j2Var.readParams(serializedData, true);
                    arrayList2.addAll(j2Var.f39545a);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                l2 l2Var22 = l2Var2;
                                l2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        k2 k2Var2 = (k2) arrayList22.get(i10);
                                        l2Var22.f39573a.put(k2Var2.f39560b, k2Var2);
                                        i10++;
                                    } else {
                                        l2Var22.f39574b = true;
                                        l2Var22.f39575c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                l2 l2Var3 = l2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        l2Var3.d = false;
                                        return;
                                    }
                                }
                                j2 j2Var2 = new j2();
                                j2Var2.f39545a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(j2Var2.getObjectSize());
                                j2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e62) {
                                    FileLog.e(e62);
                                }
                                AndroidUtilities.runOnUIThread(new h2(l2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f39525b.d = false;
                return;
        }
    }
}
