package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.tgnet.SerializedData;
public final class z1 implements Runnable {
    public final int f43292a;
    public final d2 f43293b;

    public z1(d2 d2Var, int i10) {
        this.f43292a = i10;
        this.f43293b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f43292a) {
            case 0:
                final d2 d2Var = this.f43293b;
                if (!d2Var.d) {
                    d2Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (c2 c2Var : d2Var.f43017a.values()) {
                        if (!TextUtils.isEmpty(c2Var.f43008b) && currentTimeMillis - c2Var.f43007a <= 604800000) {
                            arrayList.add(0, c2Var);
                            if (arrayList.size() >= 100) {
                                Utilities.e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                d2 d2Var2 = d2Var;
                                                d2Var2.getClass();
                                                int i10 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i10 < arrayList2.size()) {
                                                        c2 c2Var2 = (c2) arrayList2.get(i10);
                                                        d2Var2.f43017a.put(c2Var2.f43008b, c2Var2);
                                                        i10++;
                                                    } else {
                                                        d2Var2.f43018b = true;
                                                        d2Var2.f43019c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(b8.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                d2 d2Var3 = d2Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e) {
                                                        f8.g(e, true);
                                                        d2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                b2 b2Var = new b2();
                                                b2Var.f43002a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(b2Var.getObjectSize());
                                                b2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                }
                                                org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    d2 d2Var2 = d2Var;
                                    d2Var2.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i10 < arrayList2.size()) {
                                            c2 c2Var2 = (c2) arrayList2.get(i10);
                                            d2Var2.f43017a.put(c2Var2.f43008b, c2Var2);
                                            i10++;
                                        } else {
                                            d2Var2.f43018b = true;
                                            d2Var2.f43019c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(b8.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    d2 d2Var3 = d2Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e) {
                                            f8.g(e, true);
                                            d2Var3.d = false;
                                            return;
                                        }
                                    }
                                    b2 b2Var = new b2();
                                    b2Var.f43002a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(b2Var.getObjectSize());
                                    b2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
                                    }
                                    org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final d2 d2Var2 = this.f43293b;
                File file = new File(b8.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    d2Var2.f43018b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    b2 b2Var = new b2();
                    b2Var.readParams(serializedData, true);
                    arrayList2.addAll(b2Var.f43002a);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d2 d2Var22 = d2Var2;
                                d2Var22.getClass();
                                int i10 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i10 < arrayList22.size()) {
                                        c2 c2Var2 = (c2) arrayList22.get(i10);
                                        d2Var22.f43017a.put(c2Var2.f43008b, c2Var2);
                                        i10++;
                                    } else {
                                        d2Var22.f43018b = true;
                                        d2Var22.f43019c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(b8.z(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                d2 d2Var3 = d2Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
                                        d2Var3.d = false;
                                        return;
                                    }
                                }
                                b2 b2Var2 = new b2();
                                b2Var2.f43002a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(b2Var2.getObjectSize());
                                b2Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e72) {
                                    f8.g(e72, true);
                                }
                                org.telegram.messenger.i0.g3(new z1(d2Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f43293b.d = false;
                return;
        }
    }
}
