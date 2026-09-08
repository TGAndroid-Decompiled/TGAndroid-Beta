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
public final class k2 implements Runnable {
    public final int f42183a;
    public final o2 f42184b;

    public k2(o2 o2Var, int i10) {
        this.f42183a = i10;
        this.f42184b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f42183a) {
            case 0:
                final o2 o2Var = this.f42184b;
                if (!o2Var.d) {
                    o2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (n2 n2Var : o2Var.f42228a.values()) {
                        if (!TextUtils.isEmpty(n2Var.f42216b) && currentTimeMillis - n2Var.f42215a <= 604800000) {
                            arrayList.add(0, n2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                o2 o2Var2 = o2Var;
                                                o2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        n2 n2Var2 = (n2) arrayList2.get(i10);
                                                        o2Var2.f42228a.put(n2Var2.f42216b, n2Var2);
                                                        i10++;
                                                    } else {
                                                        o2Var2.f42229b = true;
                                                        o2Var2.f42230c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                o2 o2Var3 = o2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        o2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                m2 m2Var = new m2();
                                                m2Var.f42209a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(m2Var.getObjectSize());
                                                m2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
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
                                    o2 o2Var2 = o2Var;
                                    o2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            n2 n2Var2 = (n2) arrayList2.get(i10);
                                            o2Var2.f42228a.put(n2Var2.f42216b, n2Var2);
                                            i10++;
                                        } else {
                                            o2Var2.f42229b = true;
                                            o2Var2.f42230c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    o2 o2Var3 = o2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                            o2Var3.d = false;
                                            return;
                                        }
                                    }
                                    m2 m2Var = new m2();
                                    m2Var.f42209a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(m2Var.getObjectSize());
                                    m2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final o2 o2Var2 = this.f42184b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    o2Var2.f42229b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    m2 m2Var = new m2();
                    m2Var.readParams(serializedData, true);
                    arrayList2.addAll(m2Var.f42209a);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                o2 o2Var22 = o2Var2;
                                o2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        n2 n2Var2 = (n2) arrayList22.get(i10);
                                        o2Var22.f42228a.put(n2Var2.f42216b, n2Var2);
                                        i10++;
                                    } else {
                                        o2Var22.f42229b = true;
                                        o2Var22.f42230c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                o2 o2Var3 = o2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e72) {
                                        FileLog.e(e72);
                                        o2Var3.d = false;
                                        return;
                                    }
                                }
                                m2 m2Var2 = new m2();
                                m2Var2.f42209a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(m2Var2.getObjectSize());
                                m2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                AndroidUtilities.runOnUIThread(new k2(o2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f42184b.d = false;
                return;
        }
    }
}
