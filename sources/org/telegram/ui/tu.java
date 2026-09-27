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
public final class tu extends org.telegram.ui.Components.yl0 {
    public static final int f37914p3 = 0;
    public boolean X2;
    public int Y2;
    public final s4.c0 Z2;
    public final ru f37915a3;
    public final ArrayList f37916b3;
    public final ArrayList f37917c3;
    public final float[] f37918d3;
    public final int[] f37919e3;
    public final ArrayList f37920f3;
    public su[] f37921g3;
    public su[] f37922h3;
    public final boolean[] f37923i3;
    public long j3;
    public long f37924k3;
    public long f37925l3;
    public boolean f37926m3;
    public qu f37927n3;
    public final xu f37928o3;

    public tu(xu xuVar, Activity activity) {
        super(activity, null);
        li.l lVar;
        this.f37928o3 = xuVar;
        this.X2 = false;
        this.Y2 = 0;
        this.f37916b3 = new ArrayList();
        this.f37917c3 = new ArrayList();
        this.f37918d3 = new float[7];
        this.f37919e3 = new int[7];
        this.f37920f3 = new ArrayList();
        this.f37923i3 = new boolean[7];
        lVar = ((org.telegram.ui.ActionBar.o2) xuVar).glassEngine;
        lVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.c0 c0Var = new s4.c0();
        this.Z2 = c0Var;
        setLayoutManager(c0Var);
        ru ruVar = new ru(this, 0);
        this.f37915a3 = ruVar;
        setAdapter(ruVar);
        q1();
        setOnItemClickListener(new i(this, 7));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.sr.h);
        jVar.C = false;
        jVar.f43040m = false;
        setItemAnimator(jVar);
        li.b.a(this, xuVar.h, xuVar.f40048n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
    }

    public final void A1() {
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
        this.j3 = x1(6) + z1(6);
        this.f37924k3 = x1(6);
        this.f37925l3 = z1(6);
        if (this.f37921g3 == null) {
            this.f37921g3 = new su[7];
        }
        if (this.f37922h3 == null) {
            this.f37922h3 = new su[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = xu.f40043x;
            int length = iArr.length;
            float[] fArr = this.f37918d3;
            if (i19 < length) {
                int i20 = iArr[i19];
                long x12 = x1(i20) + z1(i20);
                su[] suVarArr = this.f37922h3;
                su[] suVarArr2 = this.f37921g3;
                long x13 = x1(iArr[i19]);
                long z12 = z1(iArr[i19]);
                int i21 = iArr[i19];
                int i22 = this.Y2;
                xu xuVar = this.f37928o3;
                if (i22 == 1 || i22 == 2 || i22 == 3) {
                    i10 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    i11 = 1;
                    recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.Y2 - 1, i21);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                    i17 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                    i18 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                    i11 = 1;
                }
                int i23 = iArr[i19];
                int i24 = this.Y2;
                if (i24 == i11 || i24 == 2 || i24 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    z10 = true;
                    sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.Y2 - 1, i23);
                } else {
                    i13 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                    i14 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                    i15 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                    sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                    z10 = true;
                }
                ?? obj = new Object();
                obj.d = i19;
                obj.f23299c = x12;
                obj.f23298b = z10;
                obj.e = x13;
                obj.f37581g = recivedItemsCount;
                obj.f37580f = z12;
                obj.h = sentItemsCount;
                suVarArr2[i19] = obj;
                suVarArr[i19] = obj;
                fArr[i19] = ((float) x12) / ((float) this.j3);
                i19++;
            } else {
                Arrays.sort(this.f37921g3, new ff(20));
                AndroidUtilities.roundPercents(fArr, this.f37919e3);
                Arrays.fill(this.f37923i3, true);
                return;
            }
        }
    }

    public final void B1(boolean z10) {
        String formatString;
        int i10;
        int i11;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        boolean z11;
        String format;
        CharSequence concat;
        ArrayList arrayList = this.f37916b3;
        arrayList.clear();
        ArrayList arrayList2 = this.f37917c3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i12 = 0;
        arrayList2.add(new og.a(0, false));
        int i13 = 1;
        long j3 = 0;
        if (this.j3 > 0) {
            formatString = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        } else {
            formatString = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        }
        arrayList2.add(new ou(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            su[] suVarArr = this.f37921g3;
            if (i14 >= suVarArr.length) {
                break;
            }
            su suVar = suVarArr[i14];
            long j10 = j3;
            long j11 = suVar.f23299c;
            int i15 = suVar.d;
            if (!this.f37926m3 && !this.f37920f3.contains(Integer.valueOf(i15))) {
                z11 = false;
            } else {
                z11 = true;
            }
            int i16 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
            if (i16 > 0 || z11) {
                int i17 = this.f37919e3[i15];
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
                spannableString3.setSpan(new org.telegram.ui.Components.u51(AndroidUtilities.bold()), i12, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i12, spannableString3.length(), 33);
                ?? metricAffectingSpan = new MetricAffectingSpan();
                metricAffectingSpan.f36084a = 0.1d;
                spannableString3.setSpan(metricAffectingSpan, 0, spannableString3.length(), 33);
                int i18 = xu.v[i15];
                int[] iArr = xu.f40040r[i15];
                int i19 = iArr[0];
                int i20 = iArr[1];
                if (i16 == 0) {
                    concat = LocaleController.getString(xu.f40042w[i15]);
                } else {
                    concat = TextUtils.concat(LocaleController.getString(xu.f40042w[i15]), "  ", spannableString3);
                }
                arrayList3.add(new ou(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j11)));
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
            org.telegram.ui.ActionBar.e6 e6Var = this.f30709p2;
            int v02 = org.telegram.ui.ActionBar.i6.v0(i21, e6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i21, e6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i22 = 0;
            while (i22 < arrayList3.size()) {
                int i23 = ((ou) arrayList3.get(i22)).h;
                if (i23 >= 0 && !this.f37923i3[i23]) {
                    su suVar2 = this.f37921g3[i23];
                    int[] iArr2 = xu.f40043x;
                    int i24 = suVar2.d;
                    int i25 = suVar2.f37581g;
                    int i26 = suVar2.h;
                    long j13 = suVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j14 = suVar2.f37580f;
                    int i27 = iArr2[i24];
                    if (i27 == 0) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i25), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else if (i27 != 1) {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i26))), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i25))), AndroidUtilities.formatFileSize(j13)));
                        }
                    } else {
                        if (j14 > j12 || i26 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j14)));
                        }
                        if (j13 > j12 || i25 > 0) {
                            i22++;
                            arrayList3.add(i22, ou.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j13)));
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
            if (!this.f37926m3) {
                arrayList2.add(new ou(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.f37926m3) {
            arrayList2.add(new ou(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new ou(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.f37925l3)));
            arrayList2.add(new ou(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.f37924k3)));
        }
        if (!arrayList3.isEmpty()) {
            i10 = 3;
            arrayList2.add(new ou(3, formatString));
        } else {
            i10 = 3;
        }
        if (this.Y2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new og.a(i10, false));
            }
            arrayList2.add(new ou(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
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
            arrayList2.add(new ou(i11, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new ou(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new og.a(3, false));
        ru ruVar = this.f37915a3;
        if (ruVar != null) {
            if (z10) {
                ruVar.E(arrayList, arrayList2);
            } else {
                ruVar.l();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        xu xuVar = this.f37928o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
    }

    public final long y1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.Y2;
        xu xuVar = this.f37928o3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.Y2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
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

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Y2;
        xu xuVar = this.f37928o3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.Y2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        i14 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
    }
}
