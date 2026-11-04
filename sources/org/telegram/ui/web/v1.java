package org.telegram.ui.web;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
public final class v1 implements Runnable {
    public final int f51053a;
    public final z1 f51054b;

    public v1(z1 z1Var, int i3) {
        this.f51053a = i3;
        this.f51054b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f51053a) {
            case 0:
                final z1 z1Var = this.f51054b;
                if (!z1Var.d) {
                    z1Var.d = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (y1 y1Var : z1Var.f51134a.values()) {
                        if (!TextUtils.isEmpty(y1Var.f51120b) && currentTimeMillis - y1Var.f51119a <= 604800000) {
                            arrayList.add(0, y1Var);
                            if (arrayList.size() >= 100) {
                                Utilities.f21387e.c(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                z1 z1Var2 = z1Var;
                                                z1Var2.getClass();
                                                int i3 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i3 < arrayList2.size()) {
                                                        y1 y1Var2 = (y1) arrayList2.get(i3);
                                                        z1Var2.f51134a.put(y1Var2.f51120b, y1Var2);
                                                        i3++;
                                                    } else {
                                                        z1Var2.f51135b = true;
                                                        z1Var2.f51136c = false;
                                                        return;
                                                    }
                                                }
                                            default:
                                                File file = new File(w7.z(4), "webmetacache.dat");
                                                boolean exists = file.exists();
                                                z1 z1Var3 = z1Var;
                                                if (!exists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e10) {
                                                        a8.g(e10, true);
                                                        z1Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                x1 x1Var = new x1();
                                                x1Var.f51105a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(x1Var.getObjectSize());
                                                x1Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    Utilities.f21387e.c(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    z1 z1Var2 = z1Var;
                                    z1Var2.getClass();
                                    int i3 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i3 < arrayList2.size()) {
                                            y1 y1Var2 = (y1) arrayList2.get(i3);
                                            z1Var2.f51134a.put(y1Var2.f51120b, y1Var2);
                                            i3++;
                                        } else {
                                            z1Var2.f51135b = true;
                                            z1Var2.f51136c = false;
                                            return;
                                        }
                                    }
                                default:
                                    File file = new File(w7.z(4), "webmetacache.dat");
                                    boolean exists = file.exists();
                                    z1 z1Var3 = z1Var;
                                    if (!exists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e10) {
                                            a8.g(e10, true);
                                            z1Var3.d = false;
                                            return;
                                        }
                                    }
                                    x1 x1Var = new x1();
                                    x1Var.f51105a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(x1Var.getObjectSize());
                                    x1Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                    }
                                    org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                final z1 z1Var2 = this.f51054b;
                File file = new File(w7.z(4), "webmetacache.dat");
                if (!file.exists()) {
                    z1Var2.f51135b = true;
                    return;
                }
                final ArrayList arrayList2 = new ArrayList();
                try {
                    SerializedData serializedData = new SerializedData(file);
                    x1 x1Var = new x1();
                    x1Var.readParams(serializedData, true);
                    arrayList2.addAll(x1Var.f51105a);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                z1 z1Var22 = z1Var2;
                                z1Var22.getClass();
                                int i3 = 0;
                                while (true) {
                                    ArrayList arrayList22 = arrayList2;
                                    if (i3 < arrayList22.size()) {
                                        y1 y1Var2 = (y1) arrayList22.get(i3);
                                        z1Var22.f51134a.put(y1Var2.f51120b, y1Var2);
                                        i3++;
                                    } else {
                                        z1Var22.f51135b = true;
                                        z1Var22.f51136c = false;
                                        return;
                                    }
                                }
                            default:
                                File file2 = new File(w7.z(4), "webmetacache.dat");
                                boolean exists = file2.exists();
                                z1 z1Var3 = z1Var2;
                                if (!exists) {
                                    try {
                                        file2.createNewFile();
                                    } catch (Exception e102) {
                                        a8.g(e102, true);
                                        z1Var3.d = false;
                                        return;
                                    }
                                }
                                x1 x1Var2 = new x1();
                                x1Var2.f51105a.addAll(arrayList2);
                                SerializedData serializedData2 = new SerializedData(x1Var2.getObjectSize());
                                x1Var2.serializeToStream(serializedData2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    fileOutputStream.write(serializedData2.toByteArray());
                                    fileOutputStream.close();
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                }
                                org.telegram.messenger.g0.h3(new v1(z1Var3, 2));
                                return;
                        }
                    }
                });
                return;
            default:
                this.f51054b.d = false;
                return;
        }
    }
}
