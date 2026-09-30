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
public final class ru extends org.telegram.ui.Components.zl0 {
    public static final int f37556w3 = 0;
    public boolean f37557e3;
    public int f37558f3;
    public final s4.c0 f37559g3;
    public final pu f37560h3;
    public final ArrayList f37561i3;
    public final ArrayList j3;
    public final float[] f37562k3;
    public final int[] f37563l3;
    public final ArrayList f37564m3;
    public qu[] f37565n3;
    public qu[] f37566o3;
    public final boolean[] f37567p3;
    public long f37568q3;
    public long f37569r3;
    public long f37570s3;
    public boolean f37571t3;
    public ou f37572u3;
    public final vu f37573v3;

    public ru(vu vuVar, Activity activity) {
        super(activity, null);
        this.f37573v3 = vuVar;
        this.f37557e3 = false;
        this.f37558f3 = 0;
        this.f37561i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f37562k3 = new float[7];
        this.f37563l3 = new int[7];
        this.f37564m3 = new ArrayList();
        this.f37567p3 = new boolean[7];
        s4.c0 c0Var = new s4.c0();
        this.f37559g3 = c0Var;
        setLayoutManager(c0Var);
        pu puVar = new pu(this, 0);
        this.f37560h3 = puVar;
        setAdapter(puVar);
        s1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f43103m = false;
        setItemAnimator(jVar);
    }

    public final long A1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f37558f3;
        vu vuVar = this.f37573v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.f37558f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }

    public final void B1() {
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
        this.f37568q3 = y1(6) + A1(6);
        this.f37569r3 = y1(6);
        this.f37570s3 = A1(6);
        if (this.f37565n3 == null) {
            this.f37565n3 = new qu[7];
        }
        if (this.f37566o3 == null) {
            this.f37566o3 = new qu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = vu.f38903n;
            int length = iArr.length;
            float[] fArr = this.f37562k3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long y12 = y1(i20) + A1(i20);
                qu[] quVarArr = this.f37566o3;
                qu[] quVarArr2 = this.f37565n3;
                long y13 = y1(iArr[i19]);
                long A1 = A1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.f37558f3;
                vu vuVar = this.f37573v3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.f37558f3 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.f37558f3;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.f37558f3 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f23611c = y12;
                obj.f23610b = z10;
                obj.e = y13;
                obj.f37089g = recivedItemsCount;
                obj.f37088f = A1;
                obj.h = sentItemsCount;
                quVarArr2[i19] = obj;
                quVarArr[i19] = obj;
                fArr[i19] = ((float) y12) / ((float) this.f37568q3);
                i19++;
            } else {
                Arrays.sort(this.f37565n3, new cf(20));
                AndroidUtilities.roundPercents(fArr, this.f37563l3);
                Arrays.fill(this.f37567p3, true);
                return;
            }
        }
    }

    public final void C1(boolean z10) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z11;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.f37561i3;
        arrayList.clear();
        ArrayList arrayList2 = this.j3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new og.a(0, false));
        int i13 = 1;
        long j3 = 0;
        if (this.f37568q3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(z1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(z1()));
        }
        arrayList2.add(new mu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            qu[] quVarArr = this.f37565n3;
            if (i14 >= quVarArr.length) {
                break;
            }
            qu quVar = quVarArr[i14];
            long j10 = j3;
            long j11 = quVar.f23611c;
            int i15 = quVar.d;
            if (!this.f37571t3 && !this.f37564m3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f37563l3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.v51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f35503a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = vu.f38902f[i15];
                int[] iArr = vu.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(vu.h[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(vu.h[i15]), "  ", spannableString3);
                }
                arrayList3.add(new mu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11)));
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
            org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
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
                int i23 = ((mu) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f37567p3[i23]) {
                    qu quVar2 = this.f37565n3[i23];
                    int[] iArr2 = vu.f38903n;
                    int i24 = quVar2.d;
                    int i25 = quVar2.f37089g;
                    int i26 = quVar2.h;
                    long j13 = quVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = quVar2.f37088f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i27 != 1) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, mu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
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
            if (!this.f37571t3) {
                arrayList2.add(new mu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f37571t3) {
            arrayList2.add(new mu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new mu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f37570s3)));
            arrayList2.add(new mu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f37569r3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new mu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.f37558f3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new og.a(i10, false));
            }
            arrayList2.add(new mu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i28 = this.f37558f3;
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
            arrayList2.add(new mu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new mu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new og.a(3, false));
        pu puVar = this.f37560h3;
        if (puVar != null) {
            if (z10) {
                puVar.E(arrayList, arrayList2);
            } else {
                puVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long y1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f37558f3;
        vu vuVar = this.f37573v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.f37558f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long z1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f37558f3;
        vu vuVar = this.f37573v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.f37558f3 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
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
}
