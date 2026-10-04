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
public final class vu extends org.telegram.ui.Components.zl0 {
    public static final int f41815w3 = 0;
    public boolean f41816e3;
    public int f41817f3;
    public final s4.c0 f41818g3;
    public final tu f41819h3;
    public final ArrayList f41820i3;
    public final ArrayList j3;
    public final float[] f41821k3;
    public final int[] f41822l3;
    public final ArrayList f41823m3;
    public uu[] f41824n3;
    public uu[] f41825o3;
    public final boolean[] f41826p3;
    public long f41827q3;
    public long f41828r3;
    public long f41829s3;
    public boolean f41830t3;
    public su f41831u3;
    public final zu f41832v3;

    public vu(zu zuVar, Activity activity) {
        super(activity, null);
        li.m mVar;
        this.f41832v3 = zuVar;
        this.f41816e3 = false;
        this.f41817f3 = 0;
        this.f41820i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f41821k3 = new float[7];
        this.f41822l3 = new int[7];
        this.f41823m3 = new ArrayList();
        this.f41826p3 = new boolean[7];
        mVar = ((org.telegram.ui.ActionBar.n2) zuVar).glassEngine;
        mVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.c0 c0Var = new s4.c0();
        this.f41818g3 = c0Var;
        setLayoutManager(c0Var);
        tu tuVar = new tu(this, 0);
        this.f41819h3 = tuVar;
        setAdapter(tuVar);
        s1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46562m = false;
        setItemAnimator(jVar);
        li.a.c(this, zuVar.h, zuVar.f43901n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f41817f3;
        zu zuVar = this.f41832v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.f41817f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
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
        this.f41827q3 = y1(6) + A1(6);
        this.f41828r3 = y1(6);
        this.f41829s3 = A1(6);
        if (this.f41824n3 == null) {
            this.f41824n3 = new uu[7];
        }
        if (this.f41825o3 == null) {
            this.f41825o3 = new uu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = zu.f43895x;
            int length = iArr.length;
            float[] fArr = this.f41821k3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long y12 = y1(i20) + A1(i20);
                uu[] uuVarArr = this.f41825o3;
                uu[] uuVarArr2 = this.f41824n3;
                long y13 = y1(iArr[i19]);
                long A1 = A1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.f41817f3;
                zu zuVar = this.f41832v3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.f41817f3 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.f41817f3;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.f41817f3 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f25698c = y12;
                obj.f25697b = z10;
                obj.f41300e = y13;
                obj.f41302g = recivedItemsCount;
                obj.f41301f = A1;
                obj.h = sentItemsCount;
                uuVarArr2[i19] = obj;
                uuVarArr[i19] = obj;
                fArr[i19] = ((float) y12) / ((float) this.f41827q3);
                i19++;
            } else {
                Arrays.sort(this.f41824n3, new ff(20));
                AndroidUtilities.roundPercents(fArr, this.f41822l3);
                Arrays.fill(this.f41826p3, true);
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
        ArrayList arrayList = this.f41820i3;
        arrayList.clear();
        ArrayList arrayList2 = this.j3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new og.a(0, false));
        int i13 = 1;
        long j3 = 0;
        if (this.f41827q3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(z1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(z1()));
        }
        arrayList2.add(new qu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            uu[] uuVarArr = this.f41824n3;
            if (i14 >= uuVarArr.length) {
                break;
            }
            uu uuVar = uuVarArr[i14];
            long j10 = j3;
            long j11 = uuVar.f25698c;
            int i15 = uuVar.d;
            if (!this.f41830t3 && !this.f41823m3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f41822l3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.d61(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f39535a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = zu.v[i15];
                int[] iArr = zu.f43892r[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(zu.f43894w[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(zu.f43894w[i15]), "  ", spannableString3);
                }
                arrayList3.add(new qu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11)));
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
            int i21 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.f33545p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i21, d6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i21, d6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((qu) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f41826p3[i23]) {
                    uu uuVar2 = this.f41824n3[i23];
                    int[] iArr2 = zu.f43895x;
                    int i24 = uuVar2.d;
                    int i25 = uuVar2.f41302g;
                    int i26 = uuVar2.h;
                    long j13 = uuVar2.f41300e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = uuVar2.f41301f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i27 != 1) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, qu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
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
            if (!this.f41830t3) {
                arrayList2.add(new qu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f41830t3) {
            arrayList2.add(new qu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new qu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f41829s3)));
            arrayList2.add(new qu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f41828r3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new qu(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.f41817f3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new og.a(i10, false));
            }
            arrayList2.add(new qu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i28 = this.f41817f3;
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
            arrayList2.add(new qu(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new qu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new og.a(3, false));
        tu tuVar = this.f41819h3;
        if (tuVar != null) {
            if (z10) {
                tuVar.E(arrayList, arrayList2);
            } else {
                tuVar.l();
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
        int i15 = this.f41817f3;
        zu zuVar = this.f41832v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.f41817f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long z1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f41817f3;
        zu zuVar = this.f41832v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.f41817f3 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.n2) zuVar).currentAccount;
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
