package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
public final class x1 implements Runnable {
    public final int f51384a;
    public final b2 f51385b;

    public x1(b2 b2Var, int i7) {
        this.f51384a = i7;
        this.f51385b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f51384a) {
            case 0:
                final b2 b2Var = this.f51385b;
                if (!b2Var.d) {
                    b2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (a2 a2Var : b2Var.f51095a.values()) {
                        if (!TextUtils.isEmpty(a2Var.f51080b) && currentTimeMillis - a2Var.f51079a <= 604800000) {
                            arrayList.add(0, a2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.f21333e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                b2 b2Var2 = b2Var;
                                                b2Var2.getClass();
                                                int i7 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i7 < arrayList2.size()) {
                                                        a2 a2Var2 = (a2) arrayList2.get(i7);
                                                        b2Var2.f51095a.put(a2Var2.f51080b, a2Var2);
                                                        i7++;
                                                    } else {
                                                        b2Var2.f51096b = true;
                                                        b2Var2.f51097c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                b2 b2Var3 = b2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        b2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                z1 z1Var = new z1();
                                                z1Var.f51407a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(z1Var.getObjectSize());
                                                z1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.f21333e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    b2 b2Var2 = b2Var;
                                    b2Var2.getClass();
                                    int i7 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i7 < arrayList2.size()) {
                                            a2 a2Var2 = (a2) arrayList2.get(i7);
                                            b2Var2.f51095a.put(a2Var2.f51080b, a2Var2);
                                            i7++;
                                        } else {
                                            b2Var2.f51096b = true;
                                            b2Var2.f51097c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    b2 b2Var3 = b2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            b2Var3.d = false;
                                            return;
                                        }
                                    }
                                    z1 z1Var = new z1();
                                    z1Var.f51407a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(z1Var.getObjectSize());
                                    z1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final b2 b2Var2 = this.f51385b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    b2Var2.f51096b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    z1 z1Var = new z1();
                    z1Var.readParams(serializedData, true);
                    arrayList2.addAll(z1Var.f51407a);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b2 b2Var22 = b2Var2;
                                b2Var22.getClass();
                                int i7 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i7 < arrayList22.size()) {
                                        a2 a2Var2 = (a2) arrayList22.get(i7);
                                        b2Var22.f51095a.put(a2Var2.f51080b, a2Var2);
                                        i7++;
                                    } else {
                                        b2Var22.f51096b = true;
                                        b2Var22.f51097c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(w7.z(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                b2 b2Var3 = b2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        a8.g(e102, true);
                                        b2Var3.d = false;
                                        return;
                                    }
                                }
                                z1 z1Var2 = new z1();
                                z1Var2.f51407a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(z1Var2.getObjectSize());
                                z1Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.h3(new x1(b2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f51385b.d = false;
                return;
        }
    }
}
