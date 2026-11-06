package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
public final class y1 implements Runnable {
    public final int f51406a;
    public final c2 f51407b;

    public y1(c2 c2Var, int i7) {
        this.f51406a = i7;
        this.f51407b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f51406a) {
            case 0:
                final c2 c2Var = this.f51407b;
                if (!c2Var.d) {
                    c2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (b2 b2Var : c2Var.f51111a.values()) {
                        if (!TextUtils.isEmpty(b2Var.f51102b) && currentTimeMillis - b2Var.f51101a <= 604800000) {
                            arrayList.add(0, b2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.f21333e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                c2 c2Var2 = c2Var;
                                                c2Var2.getClass();
                                                int i7 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i7 < arrayList2.size()) {
                                                        b2 b2Var2 = (b2) arrayList2.get(i7);
                                                        c2Var2.f51111a.put(b2Var2.f51102b, b2Var2);
                                                        i7++;
                                                    } else {
                                                        c2Var2.f51112b = true;
                                                        c2Var2.f51113c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                c2 c2Var3 = c2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        c2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                a2 a2Var = new a2();
                                                a2Var.f51090a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(a2Var.getObjectSize());
                                                a2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new y1(c2Var3, 2));
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
                                    c2 c2Var2 = c2Var;
                                    c2Var2.getClass();
                                    int i7 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i7 < arrayList2.size()) {
                                            b2 b2Var2 = (b2) arrayList2.get(i7);
                                            c2Var2.f51111a.put(b2Var2.f51102b, b2Var2);
                                            i7++;
                                        } else {
                                            c2Var2.f51112b = true;
                                            c2Var2.f51113c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    c2 c2Var3 = c2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            c2Var3.d = false;
                                            return;
                                        }
                                    }
                                    a2 a2Var = new a2();
                                    a2Var.f51090a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(a2Var.getObjectSize());
                                    a2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new y1(c2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final c2 c2Var2 = this.f51407b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    c2Var2.f51112b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    a2 a2Var = new a2();
                    a2Var.readParams(serializedData, true);
                    arrayList2.addAll(a2Var.f51090a);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c2 c2Var22 = c2Var2;
                                c2Var22.getClass();
                                int i7 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i7 < arrayList22.size()) {
                                        b2 b2Var2 = (b2) arrayList22.get(i7);
                                        c2Var22.f51111a.put(b2Var2.f51102b, b2Var2);
                                        i7++;
                                    } else {
                                        c2Var22.f51112b = true;
                                        c2Var22.f51113c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(w7.z(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                c2 c2Var3 = c2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        a8.g(e102, true);
                                        c2Var3.d = false;
                                        return;
                                    }
                                }
                                a2 a2Var2 = new a2();
                                a2Var2.f51090a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(a2Var2.getObjectSize());
                                a2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.h3(new y1(c2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f51407b.d = false;
                return;
        }
    }
}
