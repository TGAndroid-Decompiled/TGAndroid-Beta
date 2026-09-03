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
public final class i2 implements Runnable {
    public final int f42554a;
    public final m2 f42555b;

    public i2(m2 m2Var, int i10) {
        this.f42554a = i10;
        this.f42555b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f42554a) {
            case 0:
                final m2 m2Var = this.f42555b;
                if (!m2Var.d) {
                    m2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (l2 l2Var : m2Var.f42605a.values()) {
                        if (!TextUtils.isEmpty(l2Var.f42589b) && currentTimeMillis - l2Var.f42588a <= 604800000) {
                            arrayList.add(0, l2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                m2 m2Var2 = m2Var;
                                                m2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        l2 l2Var2 = (l2) arrayList2.get(i10);
                                                        m2Var2.f42605a.put(l2Var2.f42589b, l2Var2);
                                                        i10++;
                                                    } else {
                                                        m2Var2.f42606b = true;
                                                        m2Var2.f42607c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                m2 m2Var3 = m2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e6) {
                                                        FileLog.e(e6);
                                                        m2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                k2 k2Var = new k2();
                                                k2Var.f42581a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(k2Var.getObjectSize());
                                                k2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
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
                                    m2 m2Var2 = m2Var;
                                    m2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            l2 l2Var2 = (l2) arrayList2.get(i10);
                                            m2Var2.f42605a.put(l2Var2.f42589b, l2Var2);
                                            i10++;
                                        } else {
                                            m2Var2.f42606b = true;
                                            m2Var2.f42607c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    m2 m2Var3 = m2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                            m2Var3.d = false;
                                            return;
                                        }
                                    }
                                    k2 k2Var = new k2();
                                    k2Var.f42581a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(k2Var.getObjectSize());
                                    k2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final m2 m2Var2 = this.f42555b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    m2Var2.f42606b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    k2 k2Var = new k2();
                    k2Var.readParams(serializedData, true);
                    arrayList2.addAll(k2Var.f42581a);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m2 m2Var22 = m2Var2;
                                m2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        l2 l2Var2 = (l2) arrayList22.get(i10);
                                        m2Var22.f42605a.put(l2Var2.f42589b, l2Var2);
                                        i10++;
                                    } else {
                                        m2Var22.f42606b = true;
                                        m2Var22.f42607c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                m2 m2Var3 = m2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e62) {
                                        FileLog.e(e62);
                                        m2Var3.d = false;
                                        return;
                                    }
                                }
                                k2 k2Var2 = new k2();
                                k2Var2.f42581a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(k2Var2.getObjectSize());
                                k2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                AndroidUtilities.runOnUIThread(new i2(m2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f42555b.d = false;
                return;
        }
    }
}
