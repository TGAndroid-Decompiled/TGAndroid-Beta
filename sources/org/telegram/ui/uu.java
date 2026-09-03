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
public final class uu extends org.telegram.ui.Components.sl0 {
    public static final int f41929m3 = 0;
    public boolean U2;
    public int V2;
    public final f2.j0 W2;
    public final su X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final float[] f41930a3;
    public final int[] f41931b3;
    public final ArrayList c3;
    public tu[] f41932d3;
    public tu[] f41933e3;
    public final boolean[] f41934f3;
    public long f41935g3;
    public long f41936h3;
    public long f41937i3;
    public boolean f41938j3;
    public ru f41939k3;
    public final yu f41940l3;

    public uu(yu yuVar, Activity activity) {
        super(activity, null);
        this.f41940l3 = yuVar;
        this.U2 = false;
        this.V2 = 0;
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f41930a3 = new float[7];
        this.f41931b3 = new int[7];
        this.c3 = new ArrayList();
        this.f41934f3 = new boolean[7];
        f2.j0 j0Var = new f2.j0();
        this.W2 = j0Var;
        setLayoutManager(j0Var);
        su suVar = new su(this, 0);
        this.X2 = suVar;
        setAdapter(suVar);
        o1();
        setOnItemClickListener(new j(this, 7));
        f2.l lVar = new f2.l();
        lVar.n(220L);
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        setItemAnimator(lVar);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long v1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.V2;
        yu yuVar = this.f41940l3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.V2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long w1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.V2;
        yu yuVar = this.f41940l3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.V2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j11 = jArr[i15];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.V2;
        yu yuVar = this.f41940l3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.V2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void y1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z4;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.f41935g3 = v1(6) + x1(6);
        this.f41936h3 = v1(6);
        this.f41937i3 = x1(6);
        if (this.f41932d3 == null) {
            this.f41932d3 = new tu[7];
        }
        if (this.f41933e3 == null) {
            this.f41933e3 = new tu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = yu.f43699n;
            int length = iArr.length;
            float[] fArr = this.f41930a3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long v12 = v1(i20) + x1(i20);
                tu[] tuVarArr = this.f41933e3;
                tu[] tuVarArr2 = this.f41932d3;
                long v13 = v1(iArr[i19]);
                long x12 = x1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.V2;
                yu yuVar = this.f41940l3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.V2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.V2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    z4 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.V2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.p2) yuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z4 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f31860c = v12;
                obj.f31859b = z4;
                obj.f41637e = v13;
                obj.f41639g = recivedItemsCount;
                obj.f41638f = x12;
                obj.h = sentItemsCount;
                tuVarArr2[i19] = obj;
                tuVarArr[i19] = obj;
                fArr[i19] = ((float) v12) / ((float) this.f41935g3);
                i19++;
            } else {
                Arrays.sort(this.f41932d3, new du(1));
                AndroidUtilities.roundPercents(fArr, this.f41931b3);
                Arrays.fill(this.f41934f3, true);
                return;
            }
        }
    }

    public final void z1(boolean z4) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z10;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.Y2;
        arrayList.clear();
        ArrayList arrayList2 = this.Z2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new cg.b(0, false));
        int i13 = 1;
        long j10 = 0;
        if (this.f41935g3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(w1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(w1()));
        }
        arrayList2.add(new pu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            tu[] tuVarArr = this.f41932d3;
            if (i14 >= tuVarArr.length) {
                break;
            }
            tu tuVar = tuVarArr[i14];
            long j11 = j10;
            long j12 = tuVar.f31860c;
            int i15 = tuVar.d;
            if (!this.f41938j3 && !this.c3.contains(Integer.valueOf(i15))) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i16 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
            if (i16 > 0 || z10) {
                int i17 = this.f41931b3[i15];
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
                metricAffectingSpan.f39809a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = yu.f43698f[i15];
                int[] iArr = yu.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(yu.h[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(yu.h[i15]), "  ", spannableString3);
                }
                arrayList3.add(new pu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j12)));
            }
            i14++;
            j10 = j11;
            i13 = 1;
            i12 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i21 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.g6 g6Var = this.f31106m2;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i21, g6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i21, g6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((pu) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f41934f3[i23]) {
                    tu tuVar2 = this.f41932d3[i23];
                    int[] iArr2 = yu.f43699n;
                    int i24 = tuVar2.d;
                    int i25 = tuVar2.f41639g;
                    int i26 = tuVar2.h;
                    long j14 = tuVar2.f41637e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = tuVar2.f41638f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i27 != 1) {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, pu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
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
            if (!this.f41938j3) {
                arrayList2.add(new pu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f41938j3) {
            arrayList2.add(new pu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new pu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f41937i3)));
            arrayList2.add(new pu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f41936h3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new pu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.V2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new cg.b(i10, false));
            }
            arrayList2.add(new pu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i28 = this.V2;
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
            arrayList2.add(new pu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new pu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new cg.b(3, false));
        su suVar = this.X2;
        if (suVar != null) {
            if (z4) {
                suVar.E(arrayList, arrayList2);
            } else {
                suVar.l();
            }
        }
    }
}
