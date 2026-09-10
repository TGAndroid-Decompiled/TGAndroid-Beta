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
public final class xu extends org.telegram.ui.Components.vl0 {
    public static final int f38815p3 = 0;
    public boolean X2;
    public int Y2;
    public final s4.c0 Z2;
    public final vu f38816a3;
    public final ArrayList f38817b3;
    public final ArrayList f38818c3;
    public final float[] f38819d3;
    public final int[] f38820e3;
    public final ArrayList f38821f3;
    public wu[] f38822g3;
    public wu[] f38823h3;
    public final boolean[] f38824i3;
    public long j3;
    public long f38825k3;
    public long f38826l3;
    public boolean f38827m3;
    public uu f38828n3;
    public final bv f38829o3;

    public xu(bv bvVar, Activity activity) {
        super(activity, null);
        this.f38829o3 = bvVar;
        this.X2 = false;
        this.Y2 = 0;
        this.f38817b3 = new ArrayList();
        this.f38818c3 = new ArrayList();
        this.f38819d3 = new float[7];
        this.f38820e3 = new int[7];
        this.f38821f3 = new ArrayList();
        this.f38824i3 = new boolean[7];
        s4.c0 c0Var = new s4.c0();
        this.Z2 = c0Var;
        setLayoutManager(c0Var);
        vu vuVar = new vu(this, 0);
        this.f38816a3 = vuVar;
        setAdapter(vuVar);
        o1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        setItemAnimator(jVar);
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
        int i15 = this.Y2;
        bv bvVar = this.f38829o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long w1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.Y2;
        bv bvVar = this.f38829o3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.Y2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
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

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        bv bvVar = this.f38829o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void y1() {
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
        this.j3 = v1(6) + x1(6);
        this.f38825k3 = v1(6);
        this.f38826l3 = x1(6);
        if (this.f38822g3 == null) {
            this.f38822g3 = new wu[7];
        }
        if (this.f38823h3 == null) {
            this.f38823h3 = new wu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = bv.f31411n;
            int length = iArr.length;
            float[] fArr = this.f38819d3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long v12 = v1(i20) + x1(i20);
                wu[] wuVarArr = this.f38823h3;
                wu[] wuVarArr2 = this.f38822g3;
                long v13 = v1(iArr[i19]);
                long x12 = x1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.Y2;
                bv bvVar = this.f38829o3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.Y2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.Y2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.Y2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.p2) bvVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f21804c = v12;
                obj.f21803b = z10;
                obj.e = v13;
                obj.f38392g = recivedItemsCount;
                obj.f38391f = x12;
                obj.h = sentItemsCount;
                wuVarArr2[i19] = obj;
                wuVarArr[i19] = obj;
                fArr[i19] = ((float) v12) / ((float) this.j3);
                i19++;
            } else {
                Arrays.sort(this.f38822g3, new org.telegram.ui.Components.m9(13));
                AndroidUtilities.roundPercents(fArr, this.f38820e3);
                Arrays.fill(this.f38824i3, true);
                return;
            }
        }
    }

    public final void z1(boolean z10) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z11;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.f38817b3;
        arrayList.clear();
        ArrayList arrayList2 = this.f38818c3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new ng.a(0, false));
        int i13 = 1;
        long j3 = 0;
        if (this.j3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(w1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(w1()));
        }
        arrayList2.add(new su(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            wu[] wuVarArr = this.f38822g3;
            if (i14 >= wuVarArr.length) {
                break;
            }
            wu wuVar = wuVarArr[i14];
            long j10 = j3;
            long j11 = wuVar.f21804c;
            int i15 = wuVar.d;
            if (!this.f38827m3 && !this.f38821f3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f38820e3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f36452a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = bv.f31410f[i15];
                int[] iArr = bv.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(bv.h[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(bv.h[i15]), "  ", spannableString3);
                }
                arrayList3.add(new su(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11)));
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
            int i21 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.f6 f6Var = this.f27987p2;
            int v02 = org.telegram.ui.ActionBar.j6.v0(i21, f6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i21, f6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((su) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f38824i3[i23]) {
                    wu wuVar2 = this.f38822g3[i23];
                    int[] iArr2 = bv.f31411n;
                    int i24 = wuVar2.d;
                    int i25 = wuVar2.f38392g;
                    int i26 = wuVar2.h;
                    long j13 = wuVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = wuVar2.f38391f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i27 != 1) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, su.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
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
            if (!this.f38827m3) {
                arrayList2.add(new su(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f38827m3) {
            arrayList2.add(new su(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new su(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f38826l3)));
            arrayList2.add(new su(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f38825k3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new su(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.Y2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new ng.a(i10, false));
            }
            arrayList2.add(new su(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
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
            arrayList2.add(new su(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new su(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new ng.a(3, false));
        vu vuVar = this.f38816a3;
        if (vuVar != null) {
            if (z10) {
                vuVar.E(arrayList, arrayList2);
            } else {
                vuVar.l();
            }
        }
    }
}
