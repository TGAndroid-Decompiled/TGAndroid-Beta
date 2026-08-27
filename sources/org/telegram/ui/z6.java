package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class z6 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public static volatile boolean f45032g0 = false;

    public static long f45033h0;

    public static Long f45034i0;

    public static Long f45035j0;

    public static Long f45036k0;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public final long G;
    public boolean H;
    public boolean I;
    public w6 J;
    public int[] K;
    public float[] L;
    public v6 M;
    public k6 N;
    public p6 O;
    public av P;
    public long Q;
    public g6 R;
    public org.telegram.ui.ActionBar.f1 S;
    public org.telegram.ui.ActionBar.f1 T;
    public ih.b U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public org.telegram.ui.ActionBar.z Y;
    public org.telegram.ui.Components.j6 Z;

    public x6 f45037a;

    public org.telegram.ui.Components.j6 f45038a0;

    public hh.f1 f45039b;

    public TextView f45040b0;

    public f2.k0 f45041c;

    public ValueAnimator f45042c0;
    public org.telegram.ui.ActionBar.b2 d;

    public float f45043d0;

    public final boolean[] f45044e;

    public boolean f45045e0;

    public long f45046f;

    public float f45047f0;
    public long h;

    public long f45048n;

    public long f45049r;

    public long f45050s;
    public long v;

    public long f45051w;

    public long f45052x;

    public long f45053y;

    public z6() {
        super(null);
        this.f45044e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f45046f = -1L;
        this.h = -1L;
        this.f45048n = -1L;
        this.f45049r = -1L;
        this.f45050s = -1L;
        this.v = -1L;
        this.f45051w = -1L;
        this.f45052x = -1L;
        this.f45053y = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = true;
        this.I = true;
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f45047f0 = 1.0f;
    }

    public static void U(z6 z6Var, boolean z10, long j10, n6 n6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = z6Var.d;
            if (b2Var != null) {
                b2Var.dismiss();
                z6Var.d = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        z6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new cg.b2(z6Var, j10, 21), 150L);
        MediaDataController.getInstance(z6Var.currentAccount).checkAllMedia(true);
        z6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(z6Var, 1));
        n6Var.run();
    }

    public static void V(z6 z6Var, boolean z10) {
        if (z6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(z6Var.getParentActivity(), 3, null);
        z6Var.d = b2Var;
        b2Var.f22747c0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(z6Var.currentAccount).clearQueryTime();
        if (z10) {
            z6Var.getMessagesStorage().fullReset();
        } else {
            z6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(z6 z6Var, m6 m6Var, n6 n6Var) {
        int i10;
        int i11;
        File fileCheckDirectory;
        int i12;
        File fileCheckDirectory2;
        char c10;
        File fileCheckDirectory3;
        File fileCheckDirectory4;
        int i13 = 1;
        int[] iArr = {0};
        boolean[] zArr = z6Var.f45044e;
        int i14 = 2;
        int i15 = 3;
        int i16 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        gh.q2 q2Var = new gh.q2(m6Var, iArr, i16, 3);
        hh.b9 b9Var = new hh.b9(m6Var, iArr, i16, jCurrentTimeMillis, 13);
        long j10 = 0;
        int i17 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (i17 < 10) {
            if (zArr[i17]) {
                if (i17 == 0) {
                    j10 += z6Var.f45053y;
                    i11 = 9;
                    i14 = 0;
                    i15 = 0;
                } else if (i17 == i13) {
                    j10 += z6Var.A;
                    i11 = 9;
                    i14 = 0;
                    i15 = 2;
                } else if (i17 == i14) {
                    j10 += z6Var.f45050s;
                    i11 = 9;
                    i14 = 1;
                } else if (i17 == i15) {
                    j10 += z6Var.f45052x;
                    i11 = 9;
                } else if (i17 == 4) {
                    j10 += z6Var.v;
                    i11 = 9;
                    i14 = 0;
                    i15 = 1;
                } else if (i17 == 5) {
                    j10 += z6Var.f45051w;
                    i11 = 9;
                    i14 = 0;
                    i15 = 6;
                } else {
                    if (i17 == 6) {
                        j10 += z6Var.C;
                        i11 = 9;
                        i14 = 0;
                        i15 = 100;
                    } else {
                        i10 = 7;
                        if (i17 == 7) {
                            b9Var = b9Var;
                            j10 += z6Var.h;
                            i11 = 9;
                            i14 = 5;
                        } else {
                            b9Var = b9Var;
                            if (i17 == 8) {
                                j10 += z6Var.f45049r;
                                i11 = 9;
                                i14 = 4;
                            } else {
                                i11 = 9;
                                if (i17 == 9) {
                                    j10 += z6Var.B;
                                    i14 = 1;
                                    i15 = 0;
                                } else {
                                    i14 = 0;
                                    i15 = -1;
                                }
                            }
                        }
                        i15 = 4;
                    }
                    if (i15 != -1) {
                        if (i17 == i10) {
                            try {
                                k0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                        if (i17 == i11) {
                            fileCheckDirectory = AndroidUtilities.getLogsDir();
                        } else if (i15 == 100) {
                            fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                        } else {
                            fileCheckDirectory = FileLoader.checkDirectory(i15);
                        }
                        if (fileCheckDirectory != null) {
                            k0(fileCheckDirectory.getAbsolutePath(), i14, null, q2Var);
                        }
                        iArr[0] = iArr[0] + 1;
                        b9Var.run();
                        if (i15 == 100) {
                            fileCheckDirectory4 = FileLoader.checkDirectory(4);
                            if (fileCheckDirectory4 != null) {
                                k0(fileCheckDirectory4.getAbsolutePath(), 3, null, q2Var);
                            }
                            iArr[0] = iArr[0] + 1;
                            b9Var.run();
                        }
                        if (i15 != 0 || i15 == 2) {
                            if (i15 == 0) {
                                i12 = 100;
                            } else {
                                i12 = 101;
                            }
                            fileCheckDirectory2 = FileLoader.checkDirectory(i12);
                            if (fileCheckDirectory2 != null) {
                                k0(fileCheckDirectory2.getAbsolutePath(), i14, null, q2Var);
                            }
                            c10 = 0;
                            iArr[0] = iArr[0] + 1;
                            b9Var.run();
                        } else {
                            c10 = 0;
                        }
                        if (i15 == 3) {
                            fileCheckDirectory3 = FileLoader.checkDirectory(5);
                            if (fileCheckDirectory3 != null) {
                                k0(fileCheckDirectory3.getAbsolutePath(), i14, null, q2Var);
                            }
                            iArr[c10] = iArr[c10] + 1;
                            b9Var.run();
                        }
                        if (i17 == i11) {
                            z6Var.B = q0(1, AndroidUtilities.getLogsDir());
                        } else if (i15 == 4) {
                            z6Var.h = q0(5, FileLoader.checkDirectory(4));
                            z6Var.f45049r = q0(4, FileLoader.checkDirectory(4));
                            z10 = true;
                        } else if (i15 == 1) {
                            z6Var.v = q0(i14, FileLoader.checkDirectory(1));
                        } else if (i15 == 6) {
                            z6Var.f45051w = q0(i14, FileLoader.checkDirectory(6));
                        } else if (i15 == 3) {
                            if (i14 == 1) {
                                long jQ0 = q0(i14, FileLoader.checkDirectory(3));
                                z6Var.f45050s = jQ0;
                                z6Var.f45050s = q0(i14, FileLoader.checkDirectory(5)) + jQ0;
                            } else {
                                long jQ1 = q0(i14, FileLoader.checkDirectory(3));
                                z6Var.f45052x = jQ1;
                                z6Var.f45052x = q0(i14, FileLoader.checkDirectory(5)) + jQ1;
                            }
                        } else if (i15 == 0) {
                            long jQ2 = q0(i14, FileLoader.checkDirectory(0));
                            z6Var.f45053y = jQ2;
                            z6Var.f45053y = q0(i14, FileLoader.checkDirectory(100)) + jQ2;
                            z10 = true;
                        } else if (i15 == 2) {
                            long jQ3 = q0(i14, FileLoader.checkDirectory(2));
                            z6Var.A = jQ3;
                            z6Var.A = q0(i14, FileLoader.checkDirectory(101)) + jQ3;
                        } else if (i15 == 100) {
                            z6Var.C = q0(i14, new File(FileLoader.checkDirectory(4), "acache"));
                            long jQ4 = q0(3, FileLoader.checkDirectory(4));
                            z6Var.f45048n = jQ4;
                            z6Var.C += jQ4;
                            z10 = true;
                        }
                    }
                    i17++;
                    b9Var = b9Var;
                    i13 = 1;
                    i14 = 2;
                    i15 = 3;
                }
                i10 = 7;
                if (i15 != -1) {
                    if (i17 == i10) {
                        k0(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                    }
                    if (i17 == i11) {
                        fileCheckDirectory = AndroidUtilities.getLogsDir();
                    } else if (i15 == 100) {
                        fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                    } else {
                        fileCheckDirectory = FileLoader.checkDirectory(i15);
                    }
                    if (fileCheckDirectory != null) {
                        k0(fileCheckDirectory.getAbsolutePath(), i14, null, q2Var);
                    }
                    iArr[0] = iArr[0] + 1;
                    b9Var.run();
                    if (i15 == 100) {
                        fileCheckDirectory4 = FileLoader.checkDirectory(4);
                        if (fileCheckDirectory4 != null) {
                            k0(fileCheckDirectory4.getAbsolutePath(), 3, null, q2Var);
                        }
                        iArr[0] = iArr[0] + 1;
                        b9Var.run();
                    }
                    if (i15 != 0) {
                        if (i15 == 0) {
                            i12 = 100;
                        } else {
                            i12 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i12);
                        if (fileCheckDirectory2 != null) {
                            k0(fileCheckDirectory2.getAbsolutePath(), i14, null, q2Var);
                        }
                        c10 = 0;
                        iArr[0] = iArr[0] + 1;
                        b9Var.run();
                    } else {
                        if (i15 == 0) {
                            i12 = 100;
                        } else {
                            i12 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i12);
                        if (fileCheckDirectory2 != null) {
                            k0(fileCheckDirectory2.getAbsolutePath(), i14, null, q2Var);
                        }
                        c10 = 0;
                        iArr[0] = iArr[0] + 1;
                        b9Var.run();
                    }
                    if (i15 == 3) {
                        fileCheckDirectory3 = FileLoader.checkDirectory(5);
                        if (fileCheckDirectory3 != null) {
                            k0(fileCheckDirectory3.getAbsolutePath(), i14, null, q2Var);
                        }
                        iArr[c10] = iArr[c10] + 1;
                        b9Var.run();
                    }
                    if (i17 == i11) {
                        z6Var.B = q0(1, AndroidUtilities.getLogsDir());
                    } else if (i15 == 4) {
                        z6Var.h = q0(5, FileLoader.checkDirectory(4));
                        z6Var.f45049r = q0(4, FileLoader.checkDirectory(4));
                        z10 = true;
                    } else if (i15 == 1) {
                        z6Var.v = q0(i14, FileLoader.checkDirectory(1));
                    } else if (i15 == 6) {
                        z6Var.f45051w = q0(i14, FileLoader.checkDirectory(6));
                    } else if (i15 == 3) {
                        if (i14 == 1) {
                            long jQ5 = q0(i14, FileLoader.checkDirectory(3));
                            z6Var.f45050s = jQ5;
                            z6Var.f45050s = q0(i14, FileLoader.checkDirectory(5)) + jQ5;
                        } else {
                            long jQ6 = q0(i14, FileLoader.checkDirectory(3));
                            z6Var.f45052x = jQ6;
                            z6Var.f45052x = q0(i14, FileLoader.checkDirectory(5)) + jQ6;
                        }
                    } else if (i15 == 0) {
                        long jQ7 = q0(i14, FileLoader.checkDirectory(0));
                        z6Var.f45053y = jQ7;
                        z6Var.f45053y = q0(i14, FileLoader.checkDirectory(100)) + jQ7;
                        z10 = true;
                    } else if (i15 == 2) {
                        long jQ8 = q0(i14, FileLoader.checkDirectory(2));
                        z6Var.A = jQ8;
                        z6Var.A = q0(i14, FileLoader.checkDirectory(101)) + jQ8;
                    } else if (i15 == 100) {
                        z6Var.C = q0(i14, new File(FileLoader.checkDirectory(4), "acache"));
                        long jQ9 = q0(3, FileLoader.checkDirectory(4));
                        z6Var.f45048n = jQ9;
                        z6Var.C += jQ9;
                        z10 = true;
                    }
                }
                i17++;
                b9Var = b9Var;
                i13 = 1;
                i14 = 2;
                i15 = 3;
            } else {
                b9Var = b9Var;
                z11 = false;
            }
            i17++;
            b9Var = b9Var;
            i13 = 1;
            i14 = 2;
            i15 = 3;
        }
        long j11 = z6Var.h + z6Var.f45049r + z6Var.B + z6Var.A + z6Var.v + z6Var.f45053y + z6Var.f45050s + z6Var.f45052x + z6Var.C + z6Var.f45051w;
        f45034i0 = Long.valueOf(j11);
        z6Var.D = j11;
        f45033h0 = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        z6Var.E = statFs.getBlockCountLong() * blockSizeLong;
        z6Var.F = availableBlocksLong * blockSizeLong;
        if (z11) {
            FileLoader.getInstance(z6Var.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(z6Var.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.t8(z6Var, z10, j10, n6Var, 8));
    }

    public static void X(z6 z6Var, ValueAnimator valueAnimator) {
        z6Var.f45043d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z6Var.actionBar.setTitleColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), (int) (z6Var.f45043d0 * 255.0f)));
        z6Var.actionBar.setBackgroundColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), (int) (z6Var.f45043d0 * 255.0f)));
        z6Var.fragmentView.invalidate();
    }

    public static void Y(z6 z6Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(z6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void b0(z6 z6Var, boolean z10) {
        if (z10 != z6Var.f45045e0) {
            ValueAnimator valueAnimator = z6Var.f45042c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = z6Var.f45043d0;
            z6Var.f45045e0 = z10;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            z6Var.f45042c0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(z6Var, 2));
            z6Var.f45042c0.setInterpolator(org.telegram.ui.Components.er.h);
            z6Var.f45042c0.setDuration(380L);
            z6Var.f45042c0.start();
        }
    }

    public static String c0(z6 z6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float fRound = Math.round(f10 * 100.0f);
        return fRound <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) fRound));
    }

    public static void f0(z6 z6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(z6Var.f45046f))));
        b2Var.P = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new eh.q(2, z6Var, z10));
        z6Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    public static void g0(z6 z6Var) {
        String pluralString;
        if (z6Var.U.f11489j.size() <= 0) {
            z6Var.J.e(false);
            return;
        }
        if (z6Var.J != null) {
            if (z6Var.U.f11491l.isEmpty()) {
                pluralString = LocaleController.formatPluralString("Files", z6Var.U.f11489j.size(), Integer.valueOf(z6Var.U.f11489j.size()));
            } else {
                ArrayList arrayList = z6Var.U.f11483b;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    s6 s6Var = (s6) obj;
                    if (z6Var.U.f11491l.contains(Long.valueOf(s6Var.f42522a))) {
                        i10 += s6Var.f42523b;
                    }
                }
                int size2 = z6Var.U.f11489j.size() - i10;
                pluralString = size2 > 0 ? a9.p.w(LocaleController.formatPluralString("Chats", z6Var.U.f11491l.size(), Integer.valueOf(z6Var.U.f11491l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", z6Var.U.f11491l.size(), Integer.valueOf(z6Var.U.f11491l.size()));
            }
            z6Var.Z.c(AndroidUtilities.formatFileSize(z6Var.U.f11490k), !LocaleController.isRTL, true);
            z6Var.f45038a0.c(pluralString, !LocaleController.isRTL, true);
            z6Var.J.e(true);
        }
    }

    public static void j0(Utilities.Callback callback) {
        Long l10 = f45034i0;
        if (l10 != null) {
            callback.run(l10);
            if (System.currentTimeMillis() - f45033h0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new lt0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] fileArrListFiles;
        int i11;
        int iN0 = n0(i10, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if ((!z10 || i10 != 1) && ((z10 || i10 != 2) && ((!z11 || i10 != 5) && ((z11 || i10 != 3) && ((!z12 || i10 != 5) && (z12 || i10 != 4)))))) {
                        if (file2.isDirectory()) {
                            file2.delete();
                            i11 = iArr[0] + 1;
                            iArr[0] = i11;
                            if (callback != null) {
                                callback.run(Float.valueOf(i11 / iN0));
                            }
                        } else if ("drafts".equals(file2.getName())) {
                            k0(a9.p.w(str, "/", name), i10, iArr, callback);
                        }
                    }
                } else if (file2.isDirectory()) {
                    file2.delete();
                    i11 = iArr[0] + 1;
                    iArr[0] = i11;
                    if (callback != null) {
                        callback.run(Float.valueOf(i11 / iN0));
                    }
                } else if ("drafts".equals(file2.getName())) {
                    k0(a9.p.w(str, "/", name), i10, iArr, callback);
                }
            }
        }
    }

    public static int n0(int i10, String str) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return 0;
        }
        int iN0 = 0;
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z10 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z11 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z12 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if ((!z10 || i10 != 1) && ((z10 || i10 != 2) && ((!z11 || i10 != 5) && ((z11 || i10 != 3) && ((!z12 || i10 != 5) && (z12 || i10 != 4)))))) {
                        if (file2.isDirectory()) {
                            iN0 += n0(i10, str + "/" + name);
                        } else {
                            iN0++;
                        }
                    }
                } else if (file2.isDirectory()) {
                    iN0 += n0(i10, str + "/" + name);
                } else {
                    iN0++;
                }
            }
        }
        return iN0;
    }

    public static void p0(b5 b5Var) {
        Long l10;
        Long l11 = f45035j0;
        if (l11 == null || (l10 = f45036k0) == null) {
            Utilities.cacheClearQueue.postRunnable(new lt0(b5Var, 14));
        } else {
            b5Var.run(l11, l10);
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f45032g0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean s0(int i10, String str) {
        if (str == null || FileLoader.checkDirectory(i10) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        int i10 = 1;
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 0));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), false);
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 18));
        this.Y = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y.addView(frameLayout, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.Z = j6Var;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        j6Var.b(0.35f, 350L, erVar);
        this.Z.setTextSize(AndroidUtilities.dp(18.0f));
        this.Z.setTypeface(AndroidUtilities.bold());
        this.Z.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        frameLayout.addView(this.Z, h7.z5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f45038a0 = j6Var2;
        j6Var2.b(0.35f, 350L, erVar);
        this.f45038a0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f45038a0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        frameLayout.addView(this.f45038a0, h7.z5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f45040b0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f45040b0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f45040b0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f45040b0.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
        this.f45040b0.setTypeface(AndroidUtilities.bold());
        this.f45040b0.setGravity(17);
        this.f45040b0.setText(LocaleController.getString(R.string.CacheClear));
        int i12 = 5;
        this.f45040b0.setOnClickListener(new a(this, i12));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f45040b0, h7.z5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f45040b0, h7.z5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f1 f1VarE = v0VarA.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.S = f1VarE;
        int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
        f1VarE.setIconColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        org.telegram.ui.ActionBar.f1 f1Var = this.S;
        int i14 = org.telegram.ui.ActionBar.g6.f23284q7;
        f1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.S.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.f1 f1VarE2 = v0VarA.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.T = f1VarE2;
            f1VarE2.setIconColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            this.T.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.T.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i13, false)));
        }
        if (this.S != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.S.setText(spannableStringBuilder);
        }
        this.f45037a = new x6(this, context);
        g6 g6Var = new g6(this, context);
        this.R = g6Var;
        this.fragmentView = g6Var;
        g6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        hh.f1 f1Var2 = new hh.f1(this, context, i12);
        this.f45039b = f1Var2;
        f1Var2.p1();
        this.f45039b.setVerticalScrollBarEnabled(false);
        this.f45039b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f45039b.setClipToPadding(false);
        hh.f1 f1Var3 = this.f45039b;
        f2.k0 k0Var = new f2.k0(1, false);
        this.f45041c = k0Var;
        f1Var3.setLayoutManager(k0Var);
        g6Var.addView(this.f45039b, h7.z5.c(-1.0f, -1));
        this.f45039b.setAdapter(this.f45037a);
        h6 h6Var = new h6(this);
        h6Var.n(350L);
        h6Var.o(erVar);
        h6Var.C = false;
        h6Var.f5819m = false;
        this.f45039b.setItemAnimator(h6Var);
        this.f45039b.setOnItemClickListener(new b6(this));
        this.f45039b.j(new lh.d9(this, i10));
        g6Var.addView(this.actionBar, h7.z5.c(-2.0f, -1));
        this.R.setTargetListView(this.f45039b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.d = null;
            if (this.f45037a != null) {
                this.f45046f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.S != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.S.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.dv0.class, org.telegram.ui.Components.ox0.class, org.telegram.ui.Cells.j4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.ox0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.ox0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
        int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.ox0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.ox0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.ox0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45039b, 0, new Class[]{org.telegram.ui.Components.dv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Components.mx0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.X) {
            return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        w6 w6Var = this.J;
        if (w6Var == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        w6Var.getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) || this.J.h.f31543b == 0;
    }

    public final void l0(s6 s6Var, org.telegram.ui.Components.lx0[] lx0VarArr, ih.b bVar) {
        t6 t6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.lx0 lx0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.f22747c0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.D;
        int i10 = 0;
        while (i10 < 8) {
            if ((lx0VarArr == null || ((lx0Var = lx0VarArr[i10]) != null && lx0Var.f30485c)) && (t6Var = (t6) s6Var.d.get(i10)) != null) {
                ArrayList arrayList = t6Var.f42788b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = s6Var.f42524c;
                j10 = j11;
                long j13 = t6Var.f42787a;
                s6Var.f42524c = j12 - j13;
                this.D -= j13;
                this.F += j13;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f45053y -= t6Var.f42787a;
                } else if (i10 == 1) {
                    this.A -= t6Var.f42787a;
                } else if (i10 == 2) {
                    this.f45050s -= t6Var.f42787a;
                } else if (i10 == 3) {
                    this.f45052x -= t6Var.f42787a;
                } else if (i10 == 4) {
                    this.v -= t6Var.f42787a;
                } else if (i10 == 5) {
                    this.C -= t6Var.f42787a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ih.a aVar = (ih.a) arrayList.get(i11);
                        String absolutePath = ((ih.a) arrayList.get(i11)).f11476a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f45051w -= aVar.f11478c;
                        } else if (c10 == 0) {
                            this.f45053y -= aVar.f11478c;
                        } else if (c10 == 1) {
                            this.A -= aVar.f11478c;
                        } else {
                            this.h -= aVar.f11478c;
                        }
                    }
                } else {
                    this.h -= t6Var.f42787a;
                }
            } else {
                hashSet = hashSet2;
                j10 = j11;
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (s6Var.d.size() == 0) {
            this.U.f11483b.remove(s6Var);
        }
        w0(true);
        if (bVar != null) {
            for (ih.a aVar2 : bVar.f11489j) {
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.D;
                    long j16 = aVar2.f11478c;
                    this.D = j15 - j16;
                    this.F += j16;
                    hashSet4.add(aVar2);
                    s6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f45053y -= aVar2.f11478c;
                    } else if (i12 == 1) {
                        this.A -= aVar2.f11478c;
                    } else if (i12 == 2) {
                        this.f45050s -= aVar2.f11478c;
                    } else if (i12 == 3) {
                        this.f45052x -= aVar2.f11478c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f11478c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet<ih.a> hashSet5 = hashSet3;
        for (ih.a aVar3 : hashSet5) {
            ih.b bVar2 = this.U;
            if (bVar2.f11489j.remove(aVar3)) {
                bVar2.f11490k -= aVar3.f11478c;
            }
            ArrayList arrayListE = bVar2.e(aVar3.d);
            if (arrayListE != null) {
                arrayListE.remove(aVar3);
            }
        }
        org.telegram.ui.Components.ec ecVarQ = org.telegram.ui.Components.mc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.D)));
        ecVarQ.f28028r = false;
        ecVarQ.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new u1(this, arrayList2, b2Var, 3));
    }

    public final void m0() {
        if (this.U.f11489j.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearCache);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearCacheForChats);
        alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new b6(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, ih.b bVar) {
        File[] fileArrListFiles;
        if (file != null && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (f45032g0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i11 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i10;
                    ih.a aVar = new ih.a(file2);
                    long length = file2.length();
                    aVar.f11478c = length;
                    if (fileDialogId != null) {
                        aVar.f11477b = fileDialogId.dialogId;
                        aVar.f11481g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.f11477b;
                    if (j10 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j10, null);
                        if (s6Var == null) {
                            s6Var = new s6(aVar.f11477b);
                            longSparseArray.put(aVar.f11477b, s6Var);
                        }
                        s6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ih.b bVar = this.U;
        if (bVar == null || bVar.f11489j.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            this.U.d();
            w6 w6Var = this.J;
            if (w6Var != null) {
                w6Var.e(false);
                this.J.d();
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f45032g0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f45046f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new c6(this, 2));
        this.Q = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f45032g0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f45039b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f45039b.setClipToPadding(false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f45037a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.X) {
            this.X = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.f45044e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.W;
            if (i11 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i11);
            if (u6Var.f49413a == 11 && !u6Var.f43131i && (i10 = u6Var.f43129f) >= 0) {
                zArr2[i10] = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr2[i12] && !zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.f45053y;
            case 1:
                return this.A;
            case 2:
                return this.f45050s;
            case 3:
                return this.f45052x;
            case 4:
                return this.v;
            case 5:
                return this.f45051w;
            case 6:
                return this.C;
            case 7:
                return this.h;
            case 8:
                return this.f45049r;
            case 9:
                return this.B;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean zR0 = r0();
        boolean[] zArr = this.f45044e;
        ArrayList arrayList = this.W;
        if (zR0) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (view != null) {
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                    return;
                }
                u6 u6Var = (u6) arrayList.get(i13);
                if (u6Var.f49413a == 11 && !u6Var.f43131i && (i12 = u6Var.f43129f) >= 0 && zArr[i12]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (this.I) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                u6 u6Var2 = (u6) arrayList.get(i14);
                if (u6Var2.f49413a == 11 && !u6Var2.f43131i && (i11 = u6Var2.f43129f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !zR0;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u6 u6Var3 = (u6) arrayList.get(i16);
                if (u6Var3.f49413a == 11 && u6Var3.f43131i && (i10 = u6Var3.f43129f) >= 0) {
                    zArr[i10] = !zR0;
                }
            }
        }
        for (int i17 = 0; i17 < this.f45039b.getChildCount(); i17++) {
            View childAt = this.f45039b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                this.f45039b.getClass();
                int iR = RecyclerView.R(childAt);
                if (iR >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(iR);
                    if (u6Var4.f49413a == 11) {
                        int i18 = u6Var4.f43129f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.y1) childAt).c(!zR0, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        v6 v6Var = this.M;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.H;
            if (!z11 && this.D > 0) {
                org.telegram.ui.Components.rc[] rcVarArr = new org.telegram.ui.Components.rc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.W;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i10);
                    if (u6Var.f49413a == 11) {
                        int i11 = u6Var.f43129f;
                        boolean[] zArr = this.f45044e;
                        if (i11 >= 0) {
                            long j10 = u6Var.f43130g;
                            boolean z12 = zArr[i11];
                            org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc();
                            rcVar.f32127c = j10;
                            rcVar.f32126b = z12;
                            rcVarArr[i11] = rcVar;
                        } else if (this.I) {
                            long j11 = u6Var.f43130g;
                            boolean z13 = zArr[10];
                            org.telegram.ui.Components.rc rcVar2 = new org.telegram.ui.Components.rc();
                            rcVar2.f32127c = j11;
                            rcVar2.f32126b = z13;
                            rcVarArr[10] = rcVar2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.Q < 80) {
                    this.M.f32392n.d(0.0f, true);
                }
                this.M.f(this.D, true, rcVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.rc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.rc[0]);
            }
        }
        p6 p6Var = this.O;
        if (p6Var == null || this.H) {
            return;
        }
        z6 z6Var = p6Var.d;
        boolean[] zArr2 = z6Var.f45044e;
        long j12 = (zArr2[0] ? z6Var.f45053y : 0L) + (zArr2[1] ? z6Var.A : 0L) + (zArr2[2] ? z6Var.f45050s : 0L) + (zArr2[3] ? z6Var.f45052x : 0L) + (zArr2[4] ? z6Var.v : 0L) + (zArr2[5] ? z6Var.f45051w : 0L) + (zArr2[6] ? z6Var.C : 0L) + (zArr2[7] ? z6Var.h : 0L) + (zArr2[8] ? z6Var.f45049r : 0L) + (zArr2[9] ? z6Var.B : 0L);
        ArrayList arrayList2 = z6Var.W;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            u6 u6Var2 = (u6) arrayList2.get(i12);
            if (u6Var2.f49413a == 11) {
                int length = u6Var2.f43129f;
                if (length < 0) {
                    length = zArr2.length - 1;
                }
                if (!zArr2[length]) {
                    p6Var.a(j12, z10);
                }
            }
        }
        z10 = true;
        p6Var.a(j12, z10);
    }

    public final void w0(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z6.w0(boolean):void");
    }
}
