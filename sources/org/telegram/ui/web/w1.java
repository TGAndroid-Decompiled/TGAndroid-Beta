package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
public final class w1 implements Runnable {
    public final int f53390a;
    public final a2 f53391b;

    public w1(a2 a2Var, int i7) {
        this.f53390a = i7;
        this.f53391b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f53390a) {
            case 0:
                final a2 a2Var = this.f53391b;
                if (!a2Var.d) {
                    a2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (z1 z1Var : a2Var.f53105a.values()) {
                        if (!TextUtils.isEmpty(z1Var.f53422b) && currentTimeMillis - z1Var.f53421a <= 604800000) {
                            arrayList.add(0, z1Var);
                            if (arrayList.size() >= 100) {
                                Utilities.f22782e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a2 a2Var2 = a2Var;
                                                a2Var2.getClass();
                                                int i7 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i7 < arrayList2.size()) {
                                                        z1 z1Var2 = (z1) arrayList2.get(i7);
                                                        a2Var2.f53105a.put(z1Var2.f53422b, z1Var2);
                                                        i7++;
                                                    } else {
                                                        a2Var2.f53106b = true;
                                                        a2Var2.f53107c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                a2 a2Var3 = a2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        a2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                y1 y1Var = new y1();
                                                y1Var.f53415a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(y1Var.getObjectSize());
                                                y1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.g3(new w1(a2Var3, 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.f22782e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    a2 a2Var2 = a2Var;
                                    a2Var2.getClass();
                                    int i7 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i7 < arrayList2.size()) {
                                            z1 z1Var2 = (z1) arrayList2.get(i7);
                                            a2Var2.f53105a.put(z1Var2.f53422b, z1Var2);
                                            i7++;
                                        } else {
                                            a2Var2.f53106b = true;
                                            a2Var2.f53107c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    a2 a2Var3 = a2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            a2Var3.d = false;
                                            return;
                                        }
                                    }
                                    y1 y1Var = new y1();
                                    y1Var.f53415a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(y1Var.getObjectSize());
                                    y1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.g3(new w1(a2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final a2 a2Var2 = this.f53391b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    a2Var2.f53106b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    y1 y1Var = new y1();
                    y1Var.readParams(serializedData, true);
                    arrayList2.addAll(y1Var.f53415a);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                a2 a2Var22 = a2Var2;
                                a2Var22.getClass();
                                int i7 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i7 < arrayList22.size()) {
                                        z1 z1Var2 = (z1) arrayList22.get(i7);
                                        a2Var22.f53105a.put(z1Var2.f53422b, z1Var2);
                                        i7++;
                                    } else {
                                        a2Var22.f53106b = true;
                                        a2Var22.f53107c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(w7.z(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                a2 a2Var3 = a2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        a8.g(e102, true);
                                        a2Var3.d = false;
                                        return;
                                    }
                                }
                                y1 y1Var2 = new y1();
                                y1Var2.f53415a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(y1Var2.getObjectSize());
                                y1Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.g3(new w1(a2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f53391b.d = false;
                return;
        }
    }
}
