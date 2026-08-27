package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.z71;

public abstract class b1 extends LinearLayout {
    public boolean A;
    public boolean B;

    public final c6 f46242a;

    public final TextView f46243b;

    public final TextView[] f46244c;
    public final ImageView d;

    public final FrameLayout f46245e;

    public final ViewGroup[] f46246f;
    public final TextView[] h;

    public final TextView[][] f46247n;

    public final rp f46248r;

    public final FrameLayout f46249s;
    public final LinearLayout v;

    public int f46250w;

    public int f46251x;

    public boolean f46252y;

    public b1(Context context, c6 c6Var) {
        super(context);
        this.f46244c = new TextView[2];
        this.f46246f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f46247n = new TextView[7][];
        this.f46250w = 1;
        this.f46251x = 0;
        this.f46252y = true;
        this.f46242a = c6Var;
        setOrientation(1);
        setClipChildren(false);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            if (i10 == 0) {
                ViewGroup z71Var = new z71(context, 9);
                z71Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f46243b = textView;
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                z71Var.addView(textView, z5.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i10] = new TextView(context);
                this.h[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                this.h[i10].setTextSize(1, 13.0f);
                this.h[i10].setTextColor(g6.v0(g6.f23441z6, c6Var));
                z71Var.addView(this.h[i10], z5.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f46249s = new FrameLayout(context);
                this.f46247n[i10] = new TextView[2];
                for (int i12 = 0; i12 < 2; i12++) {
                    this.f46247n[i10][i12] = new TextView(context);
                    this.f46247n[i10][i12].setTextSize(1, 14.0f);
                    this.f46247n[i10][i12].setTextColor(g6.v0(g6.f23441z6, c6Var));
                    this.f46247n[i10][i12].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.f46249s.addView(this.f46247n[i10][i12], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    this.f46244c[i13] = new TextView(context);
                    this.f46244c[i13].setTextSize(1, 14.0f);
                    this.f46244c[i13].setTextColor(g6.v0(g6.f23441z6, c6Var));
                    this.f46244c[i13].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.f46249s.addView(this.f46244c[i13], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23441z6, c6Var), PorterDuff.Mode.SRC_IN));
                this.f46249s.addView(imageView, z5.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f46249s, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                rp rpVar = new rp(context);
                this.f46248r = rpVar;
                rpVar.getDrawable().F = true;
                rpVar.setTextSize(AndroidUtilities.dp(13.0f));
                rpVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                rpVar.setGravity(LocaleController.isRTL ? 3 : 5);
                int iDp = AndroidUtilities.dp(8.0f);
                int i14 = g6.f23251o6;
                int iV0 = g6.v0(i14, c6Var);
                a(iV0);
                int iL1 = g6.l1(0.1f, iV0);
                int iV1 = g6.v0(i14, c6Var);
                a(iV1);
                int iL2 = g6.l1(0.22f, iV1);
                rpVar.setBackground(g6.i0(iDp, iDp, iDp, iDp, iL1, iL2, iL2));
                int iV2 = g6.v0(i14, c6Var);
                a(iV2);
                rpVar.setTextColor(iV2);
                rpVar.getDrawable().v = 0.6f;
                rpVar.setVisibility(8);
                this.v.addView(rpVar, z5.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f46245e = frameLayout;
                frameLayout.addView(this.v, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                z71Var.addView(frameLayout, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f46246f[i10] = z71Var;
                addView(z71Var, z5.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup viewGroupG = y1.g(context, 0);
                this.h[i10] = new TextView(context);
                this.h[i10].setTextSize(1, 14.0f);
                this.h[i10].setTextColor(g6.v0(g6.G6, c6Var));
                this.h[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f46247n[i10] = new TextView[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    this.f46247n[i10][i15] = new TextView(context);
                    this.f46247n[i10][i15].setTextSize(1, 14.0f);
                    this.f46247n[i10][i15].setTextColor(g6.v0(g6.f23441z6, c6Var));
                    this.f46247n[i10][i15].setGravity(LocaleController.isRTL ? 3 : 5);
                    frameLayout2.addView(this.f46247n[i10][i15], z5.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    viewGroupG.addView(frameLayout2, z5.q(-2, -1, 51));
                    viewGroupG.addView(this.h[i10], z5.q(-1, -1, 53));
                } else {
                    viewGroupG.addView(this.h[i10], z5.q(-2, -1, 51));
                    viewGroupG.addView(frameLayout2, z5.q(-1, -1, 53));
                }
                this.f46246f[i10] = viewGroupG;
                addView(viewGroupG, z5.u(-1.0f, -2.0f, 51, 18.0f, i10 == 1 ? 1.0f : 11.66f, 28.0f, i10 == 6 ? 16.66f : 0.0f));
            }
            i10++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        boolean z15;
        ArrayList[] arrayListArr;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        boolean z16 = z10;
        this.B = z16;
        this.A = z12;
        if (tL_businessWorkHours == null) {
            return;
        }
        int i17 = 1;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i18 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i18);
                    if (tL_businessWeeklyOpen.start_minute <= i19 + 1) {
                        i19 = tL_businessWeeklyOpen.end_minute;
                        i18++;
                    }
                } else if (i19 >= 10079) {
                    z13 = true;
                    break;
                }
                z13 = false;
                break;
            }
        }
        z13 = false;
        break;
        if (z13) {
            this.B = false;
            z16 = false;
        }
        int i20 = 8;
        int i21 = z13 ? 8 : 0;
        ImageView imageView = this.d;
        imageView.setVisibility(i21);
        this.v.setTranslationX(z13 ? AndroidUtilities.dp(11.0f) : 0.0f);
        TLRPC.TL_timezone tL_timezoneA = t1.b(UserConfig.selectedAccount).a(tL_businessWorkHours.timezone_id);
        Calendar calendar = Calendar.getInstance();
        int offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (tL_timezoneA == null ? 0 : tL_timezoneA.utc_offset)) / 60;
        if (offset != 0 && !z13) {
            i20 = 0;
        }
        rp rpVar = this.f46248r;
        rpVar.setVisibility(i20);
        boolean z17 = offset == 0 ? false : z11;
        invalidate();
        boolean z18 = this.f46252y;
        TextView[] textViewArr = this.f46244c;
        TextView[][] textViewArr2 = this.f46247n;
        if (z18) {
            textViewArr[0].setAlpha((z16 || z17) ? 0.0f : 1.0f);
            textViewArr[1].setAlpha((z16 || !z17) ? 0.0f : 1.0f);
            imageView.setRotation(z16 ? 180.0f : 0.0f);
        } else {
            ViewPropertyAnimator duration = textViewArr[0].animate().alpha((z16 || z17) ? 0.0f : 1.0f).setDuration(320L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            textViewArr[1].animate().alpha((z16 || !z17) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(erVar).start();
            textViewArr2[0][0].animate().alpha(z16 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(erVar).start();
            textViewArr2[0][1].animate().alpha(z16 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(erVar).start();
            imageView.animate().rotation(z16 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(erVar).start();
        }
        int i22 = 0;
        while (i22 < textViewArr2.length) {
            int i23 = 0;
            while (true) {
                TextView[] textViewArr3 = textViewArr2[i22];
                if (i23 < textViewArr3.length) {
                    if (i22 == 0 && !z16) {
                        f10 = 0.0f;
                    } else if ((i23 == i17) == z17) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (this.f46252y) {
                        textViewArr3[i23].setAlpha(f10);
                    } else {
                        textViewArr3[i23].animate().alpha(f10).setDuration(320L).setInterpolator(er.h).start();
                    }
                    i23++;
                    i17 = 1;
                }
            }
            i22++;
            i17 = 1;
        }
        rpVar.c(LocaleController.getString(z17 ? R.string.BusinessHoursProfileSwitchMy : R.string.BusinessHoursProfileSwitchLocal), (LocaleController.isRTL || this.f46252y) ? false : true, true);
        this.f46252y = false;
        ArrayList[] arrayListArrZ = y0.Z(new ArrayList(tL_businessWorkHours.weekly_open));
        int i24 = (calendar.get(7) + 5) % 7;
        int i25 = calendar.get(11);
        int i26 = calendar.get(12);
        ArrayList arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i27 = 0;
        while (i27 < arrayList.size()) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i27);
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
            boolean z19 = z16;
            if (offset != 0) {
                int i28 = tL_businessWeeklyOpen2.start_minute;
                z15 = z13;
                int i29 = i28 % 1440;
                int i30 = tL_businessWeeklyOpen2.end_minute;
                arrayListArr = arrayListArrZ;
                int i31 = (i30 - i28) + i29;
                if (i29 == 0) {
                    i13 = i26;
                    if (i31 == 1440 || i31 == 1439) {
                        tL_businessWeeklyOpen3.start_minute = i28;
                        tL_businessWeeklyOpen3.end_minute = i30;
                        arrayList2.add(tL_businessWeeklyOpen3);
                    }
                    i27++;
                    z16 = z19;
                    z13 = z15;
                    i26 = i13;
                    arrayListArrZ = arrayListArr;
                }
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                i14 = tL_businessWeeklyOpen3.start_minute;
                if (i14 < 0) {
                    i16 = tL_businessWeeklyOpen3.end_minute;
                    if (i16 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i14 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i16 + 10080;
                    } else {
                        tL_businessWeeklyOpen3.start_minute = 0;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                        tL_businessWeeklyOpen4.end_minute = 10079;
                        arrayList2.add(tL_businessWeeklyOpen4);
                    }
                } else {
                    i15 = tL_businessWeeklyOpen3.end_minute;
                    if (i15 <= 10080) {
                        if (i14 > 10080) {
                            tL_businessWeeklyOpen3.start_minute = i14 - 10080;
                            tL_businessWeeklyOpen3.end_minute = i15 - 10080;
                        } else {
                            tL_businessWeeklyOpen3.end_minute = 10079;
                            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                            tL_businessWeeklyOpen5.start_minute = 0;
                            tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                            arrayList2.add(tL_businessWeeklyOpen5);
                        }
                    }
                    i27++;
                    z16 = z19;
                    z13 = z15;
                    i26 = i13;
                    arrayListArrZ = arrayListArr;
                }
                i27++;
                z16 = z19;
                z13 = z15;
                i26 = i13;
                arrayListArrZ = arrayListArr;
            } else {
                z15 = z13;
                arrayListArr = arrayListArrZ;
            }
            i13 = i26;
            tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
            tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
            arrayList2.add(tL_businessWeeklyOpen3);
            i14 = tL_businessWeeklyOpen3.start_minute;
            if (i14 < 0) {
                i16 = tL_businessWeeklyOpen3.end_minute;
                if (i16 < 0) {
                    tL_businessWeeklyOpen3.start_minute = i14 + 10080;
                    tL_businessWeeklyOpen3.end_minute = i16 + 10080;
                } else {
                    tL_businessWeeklyOpen3.start_minute = 0;
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = new TL_account.TL_businessWeeklyOpen();
                    tL_businessWeeklyOpen6.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                    tL_businessWeeklyOpen6.end_minute = 10079;
                    arrayList2.add(tL_businessWeeklyOpen6);
                }
            } else {
                i15 = tL_businessWeeklyOpen3.end_minute;
                if (i15 <= 10080) {
                    if (i14 > 10080) {
                        tL_businessWeeklyOpen3.start_minute = i14 - 10080;
                        tL_businessWeeklyOpen3.end_minute = i15 - 10080;
                    } else {
                        tL_businessWeeklyOpen3.end_minute = 10079;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen7 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen7.start_minute = 0;
                        tL_businessWeeklyOpen7.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                        arrayList2.add(tL_businessWeeklyOpen7);
                    }
                }
                i27++;
                z16 = z19;
                z13 = z15;
                i26 = i13;
                arrayListArrZ = arrayListArr;
            }
            i27++;
            z16 = z19;
            z13 = z15;
            i26 = i13;
            arrayListArrZ = arrayListArr;
        }
        boolean z20 = z16;
        boolean z21 = z13;
        ArrayList[] arrayListArr2 = arrayListArrZ;
        Collections.sort(arrayList2, new lp0(22));
        int i32 = (i24 * 1440) + (i25 * 60) + i26;
        int i33 = 0;
        while (true) {
            if (i33 >= arrayList2.size()) {
                z14 = false;
                break;
            }
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen8 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i33);
            int i34 = tL_businessWeeklyOpen8.start_minute;
            if ((i32 >= i34 && i32 <= tL_businessWeeklyOpen8.end_minute) || (((i11 = i32 + 10080) >= i34 && i11 <= tL_businessWeeklyOpen8.end_minute) || ((i12 = i32 - 10080) >= i34 && i12 <= tL_businessWeeklyOpen8.end_minute))) {
                z14 = true;
                break;
            }
            i33++;
        }
        ArrayList[] arrayListArrZ2 = y0.Z(arrayList2);
        String string = LocaleController.getString(z14 ? R.string.BusinessHoursProfileNowOpen : R.string.BusinessHoursProfileNowClosed);
        TextView textView = this.f46243b;
        textView.setText(string);
        textView.setTextColor(g6.v0(z14 ? g6.f23200l8 : g6.f23269p7, this.f46242a));
        int i35 = this.f46251x;
        int i36 = this.f46250w;
        this.f46250w = 1;
        this.f46251x = 0;
        int i37 = 0;
        while (i37 < 2) {
            ArrayList[] arrayListArr3 = i37 == 0 ? arrayListArr2 : arrayListArrZ2;
            int i38 = 0;
            while (i38 < 7) {
                int i39 = (i24 + i38) % 7;
                TextView[] textViewArr4 = this.h;
                if (i38 == 0) {
                    textViewArr4[i38].setText(LocaleController.getString(R.string.BusinessHoursProfile));
                } else {
                    String displayName = DayOfWeek.values()[i39].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    textViewArr4[i38].setText(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
                    textViewArr2[i38][0].setVisibility(z20 ? 0 : 4);
                    textViewArr2[i38][1].setVisibility(z20 ? 0 : 4);
                    textViewArr4[i38].setVisibility(z20 ? 0 : 4);
                }
                int i40 = 0;
                while (true) {
                    if (i40 < (i38 == 0 ? 2 : 1)) {
                        TextView textView2 = i40 == 0 ? textViewArr2[i38][i37] : textViewArr[i37];
                        if (i38 == 0 && !z14 && i40 == 1) {
                            int i41 = 0;
                            while (true) {
                                if (i41 >= arrayList2.size()) {
                                    i10 = -1;
                                    break;
                                }
                                i10 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i41)).start_minute;
                                if (i32 < i10) {
                                    break;
                                } else {
                                    i41++;
                                }
                            }
                            if (i10 == -1 && !arrayList2.isEmpty()) {
                                i10 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                            }
                            if (i10 == -1) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else {
                                int i42 = i10 < i32 ? (10080 - i32) + i10 : i10 - i32;
                                if (i42 < 60) {
                                    textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInMinutes", i42, new Object[0]));
                                } else {
                                    arrayList2 = arrayList2;
                                    if (i42 < 1440) {
                                        textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInHours", (int) Math.ceil(i42 / 60.0f), new Object[0]));
                                    } else {
                                        textViewArr2 = textViewArr2;
                                        textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInDays", (int) Math.ceil((i42 / 60.0f) / 24.0f), new Object[0]));
                                    }
                                }
                            }
                        } else {
                            arrayList2 = arrayList2;
                            textViewArr2 = textViewArr2;
                            if (z21) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileFullOpen));
                            } else if (arrayListArr3[i39].isEmpty()) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                            } else if (y0.c0(arrayListArr3[i39])) {
                                textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileOpen));
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                for (int i43 = 0; i43 < arrayListArr3[i39].size(); i43++) {
                                    if (i43 > 0) {
                                        sb2.append("\n");
                                    }
                                    sb2.append(arrayListArr3[i39].get(i43));
                                }
                                int size = arrayListArr3[i39].size();
                                textView2.setText(sb2);
                                if (i38 == 0) {
                                    this.f46250w = Math.max(this.f46250w, size);
                                    this.f46251x = Math.max(this.f46251x, textView2.getLineHeight() * size);
                                }
                            }
                        }
                        i40++;
                        arrayList2 = arrayList2;
                        textViewArr2 = textViewArr2;
                    }
                }
                i38++;
                arrayListArrZ2 = arrayListArrZ2;
                i24 = i24;
                z14 = z14;
            }
            i37++;
            i24 = i24;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46245e.getLayoutParams();
        float f11 = 6.0f;
        layoutParams.topMargin = AndroidUtilities.dp((this.f46250w > 2 || rpVar.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.f46250w <= 2 && rpVar.getVisibility() != 0) {
            f11 = 12.0f;
        }
        layoutParams.bottomMargin = AndroidUtilities.dp(f11);
        layoutParams.gravity = ((this.f46250w > 2 || rpVar.getVisibility() == 0) ? 16 : 80) | (LocaleController.isRTL ? 3 : 5);
        if (i36 == this.f46250w && i35 == this.f46251x) {
            return;
        }
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A) {
            Paint paintT0 = g6.T0("paintDivider", this.f46242a);
            if (paintT0 == null) {
                paintT0 = g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.B) {
            int iDp2 = AndroidUtilities.dp(60.0f);
            int i12 = this.f46250w;
            rp rpVar = this.f46248r;
            if (i12 > 2 || rpVar.getVisibility() == 0) {
                iDp = AndroidUtilities.dp(rpVar.getVisibility() == 0 ? 21.0f : 0.0f) + AndroidUtilities.dp(15.0f) + this.f46251x;
            } else {
                iDp = 0;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(iDp2, iDp) + (this.A ? 1 : 0), 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rp rpVar = this.f46248r;
        if (rpVar == null || rpVar.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x8 = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.f46246f;
        float x10 = x8 - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.f46245e;
        float x11 = x10 - frameLayout.getX();
        FrameLayout frameLayout2 = this.f46249s;
        return rpVar.getClickBounds().contains((int) ((x11 - frameLayout2.getX()) - rpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - rpVar.getY()));
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        rp rpVar = this.f46248r;
        if (rpVar != null) {
            rpVar.setOnClickListener(onClickListener);
        }
    }
}
