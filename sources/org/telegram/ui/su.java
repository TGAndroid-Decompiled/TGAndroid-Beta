package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
public final class su extends org.telegram.ui.Components.ml0 {
    public static final int f37418p3 = 0;
    public boolean X2;
    public int Y2;
    public final s4.c0 Z2;
    public final qu f37419a3;
    public final ArrayList f37420b3;
    public final ArrayList f37421c3;
    public final float[] f37422d3;
    public final int[] f37423e3;
    public final ArrayList f37424f3;
    public ru[] f37425g3;
    public ru[] f37426h3;
    public final boolean[] f37427i3;
    public long j3;
    public long f37428k3;
    public long f37429l3;
    public boolean f37430m3;
    public pu f37431n3;
    public final wu f37432o3;

    public su(wu wuVar, Activity activity) {
        super(activity, null);
        this.f37432o3 = wuVar;
        this.X2 = false;
        this.Y2 = 0;
        this.f37420b3 = new ArrayList();
        this.f37421c3 = new ArrayList();
        this.f37422d3 = new float[7];
        this.f37423e3 = new int[7];
        this.f37424f3 = new ArrayList();
        this.f37427i3 = new boolean[7];
        s4.c0 c0Var = new s4.c0();
        this.Z2 = c0Var;
        setLayoutManager(c0Var);
        qu quVar = new qu(this, 0);
        this.f37419a3 = quVar;
        setAdapter(quVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.f42662m = false;
        setItemAnimator(jVar);
    }

    public final void A1(boolean z10) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z11;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.f37420b3;
        arrayList.clear();
        ArrayList arrayList2 = this.f37421c3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new og.a(0, false));
        int i13 = 1;
        long j3 = 0;
        if (this.j3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        }
        arrayList2.add(new nu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            ru[] ruVarArr = this.f37425g3;
            if (i14 >= ruVarArr.length) {
                break;
            }
            ru ruVar = ruVarArr[i14];
            long j10 = j3;
            long j11 = ruVar.f23011c;
            int i15 = ruVar.d;
            if (!this.f37430m3 && !this.f37424f3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f37423e3[i15];
                if (i17 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[i12] = Integer.valueOf(i13);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i17);
                    Object[] objArr2 = new Object[i13];
                    objArr2[i12] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(format);
                spannableString3.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f35389a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = wu.f39089f[i15];
                int[] iArr = wu.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(wu.h[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(wu.h[i15]), "  ", spannableString3);
                }
                arrayList3.add(new nu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11)));
            }
            i14++;
            j3 = j10;
            i13 = 1;
            i12 = 0;
        }
        long j12 = j3;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i21 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.f26222p2;
            int v02 = org.telegram.ui.ActionBar.h6.v0(i21, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i21, d6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((nu) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f37427i3[i23]) {
                    ru ruVar2 = this.f37425g3[i23];
                    int[] iArr2 = wu.f39090n;
                    int i24 = ruVar2.d;
                    int i25 = ruVar2.f36932g;
                    int i26 = ruVar2.h;
                    long j13 = ruVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = ruVar2.f36931f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i27 != 1) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, nu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
                            i22++;
                            spannableString4 = spannableString;
                            spannableString5 = spannableString2;
                        }
                    }
                } else {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                }
                i22++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.f37430m3) {
                arrayList2.add(new nu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f37430m3) {
            arrayList2.add(new nu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new nu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f37429l3)));
            arrayList2.add(new nu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f37428k3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new nu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.Y2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new og.a(i10, false));
            }
            arrayList2.add(new nu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i28 = this.Y2;
            if (i28 != 1) {
                i11 = 3;
                if (i28 != 3) {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi);
                } else {
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                }
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new nu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new nu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new og.a(3, false));
        qu quVar = this.f37419a3;
        if (quVar != null) {
            if (z10) {
                quVar.E(arrayList, arrayList2);
            } else {
                quVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long w1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        wu wuVar = this.f37432o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long x1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.Y2;
        wu wuVar = this.f37432o3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.Y2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j3 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j10 = jArr[i15];
            if (j3 > j10) {
                j3 = j10;
            }
        }
        return j3;
    }

    public final long y1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        wu wuVar = this.f37432o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void z1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z10;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.j3 = w1(6) + y1(6);
        this.f37428k3 = w1(6);
        this.f37429l3 = y1(6);
        if (this.f37425g3 == null) {
            this.f37425g3 = new ru[7];
        }
        if (this.f37426h3 == null) {
            this.f37426h3 = new ru[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = wu.f39090n;
            int length = iArr.length;
            float[] fArr = this.f37422d3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long w12 = w1(i20) + y1(i20);
                ru[] ruVarArr = this.f37426h3;
                ru[] ruVarArr2 = this.f37425g3;
                long w13 = w1(iArr[i19]);
                long y12 = y1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.Y2;
                wu wuVar = this.f37432o3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.Y2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.Y2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.Y2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f23011c = w12;
                obj.f23010b = z10;
                obj.e = w13;
                obj.f36932g = recivedItemsCount;
                obj.f36931f = y12;
                obj.h = sentItemsCount;
                ruVarArr2[i19] = obj;
                ruVarArr[i19] = obj;
                fArr[i19] = ((float) w12) / ((float) this.j3);
                i19++;
            } else {
                Arrays.sort(this.f37425g3, new df(20));
                AndroidUtilities.roundPercents(fArr, this.f37423e3);
                Arrays.fill(this.f37427i3, true);
                return;
            }
        }
    }
}
