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

public final class f2 implements Runnable {

    public final int f43834a;

    public final j2 f43835b;

    public f2(j2 j2Var, int i10) {
        this.f43834a = i10;
        this.f43835b = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f43834a) {
            case 0:
                final j2 j2Var = this.f43835b;
                if (!j2Var.d) {
                    j2Var.d = true;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final ArrayList arrayList = new ArrayList();
                    for (i2 i2Var : j2Var.f43881a.values()) {
                        if (!TextUtils.isEmpty(i2Var.f43867b) && jCurrentTimeMillis - i2Var.f43866a <= 604800000) {
                            arrayList.add(0, i2Var);
                            if (arrayList.size() >= 100) {
                                final int i10 = 1;
                                Utilities.globalQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                j2 j2Var2 = j2Var;
                                                j2Var2.getClass();
                                                int i11 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = arrayList;
                                                    if (i11 >= arrayList2.size()) {
                                                        j2Var2.f43882b = true;
                                                        j2Var2.f43883c = false;
                                                    } else {
                                                        i2 i2Var2 = (i2) arrayList2.get(i11);
                                                        j2Var2.f43881a.put(i2Var2.f43867b, i2Var2);
                                                        i11++;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                                boolean zExists = file.exists();
                                                j2 j2Var3 = j2Var;
                                                if (!zExists) {
                                                    try {
                                                        file.createNewFile();
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        j2Var3.d = false;
                                                        return;
                                                    }
                                                }
                                                h2 h2Var = new h2();
                                                h2Var.f43851a.addAll(arrayList);
                                                SerializedData serializedData = new SerializedData(h2Var.getObjectSize());
                                                h2Var.serializeToStream(serializedData);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                    fileOutputStream.write(serializedData.toByteArray());
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                                AndroidUtilities.runOnUIThread(new f2(j2Var3, 2));
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                    }
                    final int i11 = 1;
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    j2 j2Var2 = j2Var;
                                    j2Var2.getClass();
                                    int i12 = 0;
                                    while (true) {
                                        ArrayList arrayList2 = arrayList;
                                        if (i12 >= arrayList2.size()) {
                                            j2Var2.f43882b = true;
                                            j2Var2.f43883c = false;
                                        } else {
                                            i2 i2Var2 = (i2) arrayList2.get(i12);
                                            j2Var2.f43881a.put(i2Var2.f43867b, i2Var2);
                                            i12++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean zExists = file.exists();
                                    j2 j2Var3 = j2Var;
                                    if (!zExists) {
                                        try {
                                            file.createNewFile();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                            j2Var3.d = false;
                                            return;
                                        }
                                    }
                                    h2 h2Var = new h2();
                                    h2Var.f43851a.addAll(arrayList);
                                    SerializedData serializedData = new SerializedData(h2Var.getObjectSize());
                                    h2Var.serializeToStream(serializedData);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(serializedData.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    AndroidUtilities.runOnUIThread(new f2(j2Var3, 2));
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                final j2 j2Var2 = this.f43835b;
                File file = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                if (file.exists()) {
                    final ArrayList arrayList2 = new ArrayList();
                    try {
                        SerializedData serializedData = new SerializedData(file);
                        h2 h2Var = new h2();
                        h2Var.readParams(serializedData, true);
                        arrayList2.addAll(h2Var.f43851a);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    final int i12 = 0;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    j2 j2Var3 = j2Var2;
                                    j2Var3.getClass();
                                    int i13 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i13 >= arrayList3.size()) {
                                            j2Var3.f43882b = true;
                                            j2Var3.f43883c = false;
                                        } else {
                                            i2 i2Var2 = (i2) arrayList3.get(i13);
                                            j2Var3.f43881a.put(i2Var2.f43867b, i2Var2);
                                            i13++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    File file2 = new File(FileLoader.getDirectory(4), "webmetacache.dat");
                                    boolean zExists = file2.exists();
                                    j2 j2Var4 = j2Var2;
                                    if (!zExists) {
                                        try {
                                            file2.createNewFile();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                            j2Var4.d = false;
                                            return;
                                        }
                                    }
                                    h2 h2Var2 = new h2();
                                    h2Var2.f43851a.addAll(arrayList2);
                                    SerializedData serializedData2 = new SerializedData(h2Var2.getObjectSize());
                                    h2Var2.serializeToStream(serializedData2);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        fileOutputStream.write(serializedData2.toByteArray());
                                        fileOutputStream.close();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    AndroidUtilities.runOnUIThread(new f2(j2Var4, 2));
                                    break;
                            }
                        }
                    });
                } else {
                    j2Var2.f43882b = true;
                }
                break;
            default:
                this.f43835b.d = false;
                break;
        }
    }
}
