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
public final class j2 implements Runnable {
    public final int f38846a;
    public final n2 f38847b;

    public j2(n2 n2Var, int i10) {
        this.f38846a = i10;
        this.f38847b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f38846a) {
            case 0:
                final n2 n2Var = this.f38847b;
                if (!n2Var.d) {
                    n2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (m2 m2Var : n2Var.f38887a.values()) {
                        if (!TextUtils.isEmpty(m2Var.f38878b) && currentTimeMillis - m2Var.f38877a <= 604800000) {
                            arrayList.add(0, m2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                n2 n2Var2 = n2Var;
                                                n2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        m2 m2Var2 = (m2) arrayList2.get(i10);
                                                        n2Var2.f38887a.put(m2Var2.f38878b, m2Var2);
                                                        i10++;
                                                    } else {
                                                        n2Var2.f38888b = true;
                                                        n2Var2.f38889c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                n2 n2Var3 = n2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        n2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                l2 l2Var = new l2();
                                                l2Var.f38871a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(l2Var.getObjectSize());
                                                l2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                                AndroidUtilities.runOnUIThread(new j2(n2Var3, 2));
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
                                    n2 n2Var2 = n2Var;
                                    n2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            m2 m2Var2 = (m2) arrayList2.get(i10);
                                            n2Var2.f38887a.put(m2Var2.f38878b, m2Var2);
                                            i10++;
                                        } else {
                                            n2Var2.f38888b = true;
                                            n2Var2.f38889c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    n2 n2Var3 = n2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            n2Var3.d = false;
                                            return;
                                        }
                                    }
                                    l2 l2Var = new l2();
                                    l2Var.f38871a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(l2Var.getObjectSize());
                                    l2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    AndroidUtilities.runOnUIThread(new j2(n2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final n2 n2Var2 = this.f38847b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    n2Var2.f38888b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    l2 l2Var = new l2();
                    l2Var.readParams(serializedData, true);
                    arrayList2.addAll(l2Var.f38871a);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                n2 n2Var22 = n2Var2;
                                n2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        m2 m2Var2 = (m2) arrayList22.get(i10);
                                        n2Var22.f38887a.put(m2Var2.f38878b, m2Var2);
                                        i10++;
                                    } else {
                                        n2Var22.f38888b = true;
                                        n2Var22.f38889c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                n2 n2Var3 = n2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        n2Var3.d = false;
                                        return;
                                    }
                                }
                                l2 l2Var2 = new l2();
                                l2Var2.f38871a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(l2Var2.getObjectSize());
                                l2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e72) {
                                    FileLog.e(e72);
                                }
                                AndroidUtilities.runOnUIThread(new j2(n2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f38847b.d = false;
                return;
        }
    }
}
