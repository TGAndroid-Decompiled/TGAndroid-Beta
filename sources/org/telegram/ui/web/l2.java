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
public final class l2 implements Runnable {
    public final int f38011a;
    public final p2 f38012b;

    public l2(p2 p2Var, int i10) {
        this.f38011a = i10;
        this.f38012b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f38011a) {
            case 0:
                final p2 p2Var = this.f38012b;
                if (!p2Var.d) {
                    p2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (o2 o2Var : p2Var.f38052a.values()) {
                        if (!TextUtils.isEmpty(o2Var.f38035b) && currentTimeMillis - o2Var.f38034a <= 604800000) {
                            arrayList.add(0, o2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                p2 p2Var2 = p2Var;
                                                p2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        o2 o2Var2 = (o2) arrayList2.get(i10);
                                                        p2Var2.f38052a.put(o2Var2.f38035b, o2Var2);
                                                        i10++;
                                                    } else {
                                                        p2Var2.f38053b = true;
                                                        p2Var2.f38054c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                p2 p2Var3 = p2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        FileLog.e(e);
                                                        p2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                n2 n2Var = new n2();
                                                n2Var.f38026a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(n2Var.getObjectSize());
                                                n2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                                AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
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
                                    p2 p2Var2 = p2Var;
                                    p2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            o2 o2Var2 = (o2) arrayList2.get(i10);
                                            p2Var2.f38052a.put(o2Var2.f38035b, o2Var2);
                                            i10++;
                                        } else {
                                            p2Var2.f38053b = true;
                                            p2Var2.f38054c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    p2 p2Var3 = p2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            p2Var3.d = false;
                                            return;
                                        }
                                    }
                                    n2 n2Var = new n2();
                                    n2Var.f38026a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(n2Var.getObjectSize());
                                    n2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                    AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final p2 p2Var2 = this.f38012b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (!file.exists()) {
                    p2Var2.f38053b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    n2 n2Var = new n2();
                    n2Var.readParams(serializedData, true);
                    arrayList2.addAll(n2Var.f38026a);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                p2 p2Var22 = p2Var2;
                                p2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        o2 o2Var2 = (o2) arrayList22.get(i10);
                                        p2Var22.f38052a.put(o2Var2.f38035b, o2Var2);
                                        i10++;
                                    } else {
                                        p2Var22.f38053b = true;
                                        p2Var22.f38054c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                p2 p2Var3 = p2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        p2Var3.d = false;
                                        return;
                                    }
                                }
                                n2 n2Var2 = new n2();
                                n2Var2.f38026a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(n2Var2.getObjectSize());
                                n2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e72) {
                                    FileLog.e(e72);
                                }
                                AndroidUtilities.runOnUIThread(new l2(p2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f38012b.d = false;
                return;
        }
    }
}
