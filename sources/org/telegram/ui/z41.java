package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class z41 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public boolean A0;
    public boolean B0;
    public m41 C0;
    public fi.k6 D0;
    public l41 E;
    public int E0;
    public l41 F;
    public final m4 F0;
    public l41 G;
    public xi.e G0;
    public v41 H;
    public PorterDuffColorFilter H0;
    public l41 I;
    public int I0;
    public l41 J;
    public l41 K;
    public l41 L;
    public l41 M;
    public l41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.sn S;
    public z31 T;
    public v4.b0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.fh0 W;
    public e41 X;
    public a41 Y;
    public y41 Z;
    public TLRPC.ChatFull f53842a;
    public lg.f f53843a0;
    public final long f53844b;
    public LinearLayout f53845b0;
    public boolean f53846c;
    public final boolean f53847c0;
    public l41 d;
    public final boolean f53848d0;
    public l41 f53849e;
    public final boolean f53850e0;
    public u41 f53851f;
    public long f53852f0;
    public long f53853g0;
    public l41 h;
    public final org.telegram.ui.ActionBar.t1[] f53854h0;
    public x31 f53855i0;
    public sb f53856j0;
    public xd f53857k0;
    public View f53858l0;
    public FrameLayout m0;
    public l41 f53859n;
    public te.a f53860n0;
    public final boolean f53861o0;
    public le0 f53862p0;
    public FrameLayout f53863q0;
    public l41 f53864r;
    public qh.b[] f53865r0;
    public l41 f53866s;
    public int f53867s0;
    public final SparseIntArray f53868t0;
    public final SparseIntArray f53869u0;
    public final ArrayList f53870v0;
    public l41 f53871w;
    public final ArrayList f53872w0;
    public l41 f53873x;
    public final ArrayList f53874x0;
    public l41 f53875y;
    public final ArrayList f53876y0;
    public final ArrayList f53877z0;

    public z41(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.f53854h0 = new org.telegram.ui.ActionBar.t1[1];
        this.f53867s0 = -1;
        this.f53868t0 = new SparseIntArray();
        this.f53869u0 = new SparseIntArray();
        this.f53870v0 = new ArrayList();
        this.f53872w0 = new ArrayList();
        this.f53874x0 = new ArrayList();
        this.f53876y0 = new ArrayList();
        this.f53877z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f53844b = j3;
        this.f53847c0 = bundle.getBoolean("is_megagroup", false);
        this.f53848d0 = bundle.getBoolean("start_from_boosts", false);
        this.f53850e0 = bundle.getBoolean("start_from_monetization", false);
        this.f53861o0 = bundle.getBoolean("only_boosts", false);
        this.f53842a = getMessagesController().N0(j3);
    }

    public static void Z(final z41 z41Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        float abs5;
        int i7;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        String str10;
        ArrayList arrayList4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList5 = z41Var.O;
        ArrayList arrayList6 = z41Var.P;
        ArrayList arrayList7 = z41Var.f53870v0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final l41[] l41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.hd.M0(2131749273, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.hd.M0(2131750610, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.hd.M0(2131744033, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.hd.M0(2131743530, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.hd.M0(2131749375, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.hd.M0(2131743529, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.hd.M0(2131748274, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.hd.M0(2131749041, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.hd.M0(2131747920, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.hd.M0(2131746385, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.hd.M0(2131744659, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.hd.M0(2131744504, "StoryReactionsByEmotionChartTitle"), 2, false)};
            l41 l41Var = l41VarArr[2];
            if (l41Var != null) {
                l41Var.f48841n = true;
            }
            ?? obj = new Object();
            xi.e a10 = u41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f51754o = org.telegram.messenger.hd.M0(2131746378, "ReactionsPerPost");
            obj.f51755p = (String) a10.f60055a;
            obj.f51756q = (String) a10.f60056b;
            obj.f51757r = ((Boolean) a10.f60057c).booleanValue();
            obj.f51758s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = u41.a(tL_broadcastStats.reactions_per_story);
            obj.f51759t = org.telegram.messenger.hd.M0(2131746377, "ReactionsPerStory");
            obj.f51760u = (String) a11.f60055a;
            obj.v = (String) a11.f60056b;
            obj.f51761w = ((Boolean) a11.f60057c).booleanValue();
            obj.f51762x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = u41.a(tL_broadcastStats.views_per_story);
            obj.f51763y = org.telegram.messenger.hd.M0(2131743527, "ViewsPerStory");
            obj.f51764z = (String) a12.f60055a;
            obj.A = (String) a12.f60056b;
            obj.B = ((Boolean) a12.f60057c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = u41.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.hd.M0(2131745397, "SharesPerStory");
            obj.E = (String) a13.f60055a;
            obj.F = (String) a13.f60056b;
            obj.G = ((Boolean) a13.f60057c).booleanValue();
            obj.H = ((Boolean) a13.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str19 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d2);
            if (d2 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i11 / ((float) d2)) * 100.0f);
            }
            obj.f51742a = org.telegram.messenger.hd.M0(2131750610, "FollowersChartTitle");
            obj.f51743b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f51744c = "";
            } else {
                int i12 = (int) abs5;
                if (abs5 == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i11 <= 0) {
                        str17 = "";
                    } else {
                        str17 = str4;
                    }
                    sb2.append(str17);
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    obj.f51744c = sb2.toString() + " (" + i12 + "%)";
                    i7 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i11 <= 0) {
                        str16 = "";
                    } else {
                        str16 = str4;
                    }
                    sb3.append(str16);
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i7 = i11;
                    obj.f51744c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i7 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            if (d11 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i13 / ((float) d11)) * 100.0f);
            }
            obj.f51748i = org.telegram.messenger.hd.M0(2131745398, "SharesPerPost");
            obj.f51749j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 != 0 && abs6 != 0.0f) {
                int i14 = (int) abs6;
                if (abs6 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i13 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str4;
                    }
                    sb4.append(str15);
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    obj.f51750k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i13 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str4;
                    }
                    sb5.append(str14);
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    obj.f51750k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f51750k = "";
            }
            if (i13 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f51751l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f51745e = org.telegram.messenger.hd.M0(2131743528, "ViewsPerPost");
            obj.f51746f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 != 0 && abs7 != 0.0f) {
                int i16 = (int) abs7;
                if (abs7 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i15 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str4;
                    }
                    sb6.append(str13);
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    obj.f51747g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i15 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str4;
                    }
                    sb7.append(str12);
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    obj.f51747g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f51747g = "";
            }
            if (i15 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f51752m = org.telegram.messenger.hd.M0(2131751143, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f51753n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                obj.f51753n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            z41Var.f53851f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            z41Var.f53852f0 = tL_statsDateRangeDays.max_date * 1000;
            z41Var.f53853g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                i20++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f52430a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    z41Var.f53868t0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    z41Var.f53874x0.add(obj2);
                    z41Var.f53869u0.put(obj2.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str19 = str10;
                str18 = str11;
                arrayList8 = arrayList4;
                size = i21;
            }
            str3 = str19;
            ArrayList arrayList12 = arrayList8;
            str2 = str18;
            org.telegram.messenger.g0.h3(new t31(z41Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((w41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.vr messagesStorage = z41Var.getMessagesStorage();
                int i22 = z41Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f27220a.c(new org.telegram.messenger.tp(messagesStorage, org.telegram.messenger.xz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -z41Var.f53844b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.h3(new Runnable(z41Var) {
                public final z41 f51731b;

                {
                    this.f51731b = z41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z41 z41Var2 = this.f51731b;
                            z41Var2.getClass();
                            l41[] l41VarArr2 = l41VarArr;
                            z41Var2.f53864r = l41VarArr2[0];
                            z41Var2.h = l41VarArr2[1];
                            z41Var2.f53849e = l41VarArr2[2];
                            z41Var2.f53859n = l41VarArr2[3];
                            z41Var2.d = l41VarArr2[4];
                            z41Var2.f53866s = l41VarArr2[5];
                            z41Var2.f53871w = l41VarArr2[6];
                            z41Var2.f53873x = l41VarArr2[7];
                            z41Var2.f53875y = l41VarArr2[8];
                            z41Var2.E = l41VarArr2[9];
                            z41Var2.F = l41VarArr2[10];
                            z41Var2.G = l41VarArr2[11];
                            z41Var2.j0(l41VarArr2);
                            return;
                        default:
                            z41 z41Var3 = this.f51731b;
                            z41Var3.getClass();
                            l41[] l41VarArr3 = l41VarArr;
                            z41Var3.d = l41VarArr3[0];
                            z41Var3.I = l41VarArr3[1];
                            z41Var3.J = l41VarArr3[2];
                            z41Var3.K = l41VarArr3[3];
                            z41Var3.L = l41VarArr3[4];
                            z41Var3.M = l41VarArr3[5];
                            z41Var3.f53849e = l41VarArr3[6];
                            z41Var3.N = l41VarArr3[7];
                            z41Var3.j0(l41VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "TopHoursChartTitle";
            str2 = "%";
            str3 = "GrowthChartTitle";
            str4 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            l41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.hd.M0(2131749375, str3), r15, r15);
            l41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.hd.M0(2131749427, "GroupMembersChartTitle"), r15, r15);
            l41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.hd.M0(2131748271, "NewMembersBySourceChartTitle"), 2, r15);
            l41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.hd.M0(2131748618, "MembersLanguageChartTitle"), 4, true);
            l41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.hd.M0(2131748462, "MessagesChartTitle"), 2, r15);
            l41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.hd.M0(2131754489, "ActionsChartTitle"), 1, r15);
            l41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.hd.M0(2131744033, str), r15, r15);
            l41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.hd.M0(2131744034, "TopDaysOfWeekChartTitle"), 4, r15);
            final l41[] l41VarArr2 = new l41[8];
            l41VarArr2[r15] = i02;
            l41VarArr2[1] = i03;
            l41VarArr2[2] = i04;
            l41VarArr2[3] = i05;
            l41VarArr2[4] = i06;
            l41VarArr2[5] = i07;
            l41VarArr2[6] = i08;
            l41VarArr2[7] = i09;
            l41 l41Var2 = l41VarArr2[6];
            if (l41Var2 != null) {
                l41Var2.f48841n = true;
            }
            l41 l41Var3 = l41VarArr2[7];
            if (l41Var3 != null) {
                l41Var3.f48842o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            if (d15 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i23 / ((float) d15)) * 100.0f);
            }
            obj3.f52116a = org.telegram.messenger.hd.M0(2131748617, "MembersOverviewTitle");
            obj3.f52117b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 != 0 && abs != 0.0f) {
                int i24 = (int) abs;
                if (abs == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i23 <= 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    sb8.append(str9);
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    obj3.f52118c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i23 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str4;
                    }
                    sb9.append(str8);
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    obj3.f52118c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f52118c = "";
            }
            if (i23 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            if (d17 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i25 / ((float) d17)) * 100.0f);
            }
            obj3.f52122i = org.telegram.messenger.hd.M0(2131743532, "ViewingMembers");
            obj3.f52123j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i25 <= 0) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                sb10.append(str7);
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                obj3.f52124k = sb10.toString();
            } else {
                obj3.f52124k = "";
            }
            if (i25 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f52125l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f52126m = org.telegram.messenger.hd.M0(2131747067, "PostingMembers");
            obj3.f52127n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                sb11.append(str6);
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                obj3.f52128o = sb11.toString();
            } else {
                obj3.f52128o = "";
            }
            if (i26 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f52129p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f52119e = org.telegram.messenger.hd.M0(2131748453, "MessagesOverview");
            obj3.f52120f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                sb12.append(str5);
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                obj3.f52121g = sb12.toString();
            } else {
                obj3.f52121g = "";
            }
            if (i27 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            z41Var.H = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            z41Var.f53852f0 = tL_statsDateRangeDays2.max_date * 1000;
            z41Var.f53853g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f51098a = s41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.hd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.hd.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.hd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f51099b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i28++;
                    arrayList2 = arrayList3;
                    i10 = i30;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = z41Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f51098a = s41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.hd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.f51099b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = z41Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f51098a = s41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f51099b = org.telegram.messenger.hd.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f51099b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.h3(new Runnable(z41Var) {
                public final z41 f51731b;

                {
                    this.f51731b = z41Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z41 z41Var2 = this.f51731b;
                            z41Var2.getClass();
                            l41[] l41VarArr22 = l41VarArr2;
                            z41Var2.f53864r = l41VarArr22[0];
                            z41Var2.h = l41VarArr22[1];
                            z41Var2.f53849e = l41VarArr22[2];
                            z41Var2.f53859n = l41VarArr22[3];
                            z41Var2.d = l41VarArr22[4];
                            z41Var2.f53866s = l41VarArr22[5];
                            z41Var2.f53871w = l41VarArr22[6];
                            z41Var2.f53873x = l41VarArr22[7];
                            z41Var2.f53875y = l41VarArr22[8];
                            z41Var2.E = l41VarArr22[9];
                            z41Var2.F = l41VarArr22[10];
                            z41Var2.G = l41VarArr22[11];
                            z41Var2.j0(l41VarArr22);
                            return;
                        default:
                            z41 z41Var3 = this.f51731b;
                            z41Var3.getClass();
                            l41[] l41VarArr3 = l41VarArr2;
                            z41Var3.d = l41VarArr3[0];
                            z41Var3.I = l41VarArr3[1];
                            z41Var3.J = l41VarArr3[2];
                            z41Var3.K = l41VarArr3[3];
                            z41Var3.L = l41VarArr3[4];
                            z41Var3.M = l41VarArr3[5];
                            z41Var3.f53849e = l41VarArr3[6];
                            z41Var3.N = l41VarArr3[7];
                            z41Var3.j0(l41VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void a0(z41 z41Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.gj(z41Var.currentAccount, arrayList2.get(i7), false, true));
            }
            z41Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new t31(z41Var, arrayList, 1));
    }

    public static void c0(z41 z41Var) {
        y41 y41Var = z41Var.Z;
        if (y41Var != null) {
            y41Var.f53412b = true;
        }
        int childCount = z41Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = z41Var.T.getChildAt(i7);
            if (childAt instanceof k41) {
                ((k41) childAt).f48216b.f19456u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.e2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f28051id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).N0(chat.f28051id);
        if (N0 != null && (N0.can_view_stats || N0.can_view_stars_revenue)) {
            return new z41(bundle);
        }
        return new t5(-chat.f28051id);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z10) {
        if (i7 == 0) {
            return new mg.b(jSONObject);
        }
        if (i7 == 1) {
            return new mg.b(jSONObject);
        }
        if (i7 == 2) {
            ?? bVar = new mg.b(jSONObject);
            int length = ((mg.a) bVar.d.get(0)).f20613a.length;
            int size = bVar.d.size();
            bVar.f20630l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f20630l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f20630l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f20613a[i10];
                }
            }
            bVar.f20631m = new k8.a(bVar.f20630l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f20620a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f20613a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f20620a.length / 2.0f) {
                        arrayList.add((mg.a) bVar2.d.get(i14));
                    }
                }
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    bVar2.d.remove((mg.a) obj);
                }
            }
            int length3 = ((mg.a) bVar2.d.get(0)).f20613a.length;
            int size3 = bVar2.d.size();
            bVar2.f20632l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f20632l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f20632l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f20613a[i16];
                }
            }
            new k8.a(bVar2.f20632l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static l41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        l41 l41Var = new l41(str, i7);
        l41Var.f48840m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                l41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                l41Var.f48835g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f20620a) == null || jArr2.length < 2) {
                    l41Var.f48839l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f20620a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    l41Var.f48833e = new mg.e(h02, j3);
                    l41Var.f48832c = j3;
                    return l41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            l41Var.f48834f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return l41Var;
    }

    public static void n0(l41 l41Var, ArrayList arrayList, org.telegram.ui.ActionBar.r6 r6Var) {
        mg.b bVar;
        int i7;
        if (l41Var != null && (bVar = l41Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                mg.a aVar = (mg.a) obj;
                int i11 = aVar.f20618g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.j6.f1(i11)) {
                        int i12 = aVar.f20618g;
                        if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                            i7 = aVar.f20619i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.j6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.j6.hm[aVar.f20618g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, r6Var, aVar.f20618g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29184v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29165u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29222x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28957j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        int i7;
        boolean z12;
        int i10;
        String str;
        boolean z13;
        z41 z41Var = this;
        z41Var.setHasOwnBackground(true);
        z41Var.f53843a0 = new lg.f((org.telegram.ui.ActionBar.e6) null);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(z41Var.currentAccount);
        long j3 = z41Var.f53844b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(z41Var.currentAccount).N0(j3);
        if (N0 != null && N0.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean R = org.telegram.messenger.t3.R(M0);
        if (N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.J, 2131744892));
        }
        arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.P, 2131753163));
        if (z11) {
            arrayList.add(qh.b.c(context, z41Var.resourceProvider, qh.a.Q, 2131748407));
        }
        z41Var.f53865r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        le0 le0Var = new le0(context, z41Var.resourceProvider);
        z41Var.f53862p0 = le0Var;
        le0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        z41Var.f53862p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        z41Var.f53862p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        z41Var.f53863q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(22));
        z41Var.f53863q0.addView(z41Var.f53862p0, c8.ja.e(-1, 72, 81));
        z41Var.f53863q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = z41Var.f53865r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new mu0(z41Var, i11, 1));
            z41Var.f53862p0.addView(z41Var.f53865r0[i11]);
            z41Var.f53862p0.i(bVar, true, false);
            i11++;
        }
        z41Var.f53855i0 = new x31(z41Var, z41Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(z41Var, -j3, z41Var.getResourceProvider());
            z41Var.f53856j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            z41Var.glassEngine.b(z41Var.f53856j0.G);
        }
        if (z11) {
            Activity parentActivity = z41Var.getParentActivity();
            int i12 = z41Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.e6 resourceProvider = z41Var.getResourceProvider();
            ri.q qVar = z41Var.glassEngine;
            if (org.telegram.messenger.t3.V(M0) && N0.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            i7 = -1;
            xd xdVar = new xd(parentActivity, z41Var, i12, j10, resourceProvider, qVar, z13, N0.can_view_stars_revenue);
            z41Var = z41Var;
            z41Var.f53857k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        z41Var.f53855i0.setAdapter(new y31(z41Var, z14, R, z11, frameLayout4));
        boolean z15 = z41Var.f53861o0;
        if (R && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        z41Var.f53846c = z12;
        if (z12 && z41Var.f53848d0) {
            z41Var.f53855i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && z41Var.f53850e0) {
            x31 x31Var = z41Var.f53855i0;
            if (!z15 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            x31Var.setPosition(i10 + (z14 ? 1 : 0));
        }
        z41Var.p0(z41Var.f53855i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(z41Var.getParentActivity());
        frameLayout5.addView(z41Var.f53855i0, c8.ja.g());
        View view = new View(context);
        z41Var.f53858l0 = view;
        frameLayout5.addView(view, c8.ja.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        z41Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(z41Var.m0, c8.ja.g());
        frameLayout5.addView(z41Var.simpleActionBar);
        if (z41Var.f53846c) {
            z41Var.setBulletinDelegate(new bi.t(13));
            z41Var.f53863q0.setBackground(z41Var.getBaseSimpleGlass().b(z41Var.f53863q0));
            frameLayout5.addView(z41Var.f53863q0, c8.ja.e(i7, -2, 80));
        }
        z41Var.fragmentView = frameLayout5;
        z31 z31Var = new z31(z41Var, context);
        z41Var.T = z31Var;
        z31Var.setCaptureSectionsDecoratorAllowed(true);
        z41Var.T.setSections(true);
        z41Var.T.setClipToPadding(false);
        z41Var.glassEngine.b(z41Var.T);
        z41Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        z41Var.f53845b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        z41Var.W = imageView;
        imageView.setAutoRepeat(true);
        z41Var.W.f(2131624229, 120, 120, null);
        z41Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.j6.Fj;
        org.telegram.ui.ActionBar.q6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.hd.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.hd.M0(2131748776, null));
        textView2.setGravity(1);
        z41Var.f53845b0.addView(z41Var.W, c8.ja.t(120, 120, 1, 0, 0, 0, 20));
        z41Var.f53845b0.addView(textView, c8.ja.t(-2, -2, 1, 0, 0, 0, 10));
        z41Var.f53845b0.addView(textView2, c8.ja.r(-2, -2, 1));
        frameLayout4.addView(z41Var.f53845b0, c8.ja.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (z41Var.X == null) {
            z41Var.X = new e41(z41Var);
        }
        z41Var.T.setAdapter(z41Var.X);
        v4.b0 b0Var = new v4.b0();
        z41Var.U = b0Var;
        z41Var.T.setLayoutManager(b0Var);
        z41Var.Y = new v4.k();
        z41Var.T.setItemAnimator(null);
        z41Var.T.j(new y11(z41Var, 2));
        z41Var.T.setOnItemClickListener(new ux0(z41Var, 6));
        z41Var.T.setOnItemLongClickListener(new w31(z41Var));
        frameLayout4.addView(z41Var.T);
        z41Var.S = new org.telegram.ui.Components.sn(context, null, false, null);
        TLRPC.Chat M02 = z41Var.getMessagesController().M0(Long.valueOf(j3));
        z41Var.S.setChatAvatar(M02);
        z41Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        org.telegram.ui.ActionBar.w4 w4Var = z41Var.simpleActionBar;
        if (M02 == null) {
            str = "";
        } else {
            str = M02.title;
        }
        w4Var.setTitle(str);
        z41Var.simpleActionBar.setActionBarMenuOnItemClick(new ct0(z41Var, 13));
        z41Var.S.i(org.telegram.ui.ActionBar.j6.x0(null, i13, false), org.telegram.ui.ActionBar.j6.x0(null, i14, false));
        boolean z16 = z41Var.B0;
        m4 m4Var = z41Var.F0;
        if (z16) {
            z41Var.f53845b0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(m4Var, 500L);
            z41Var.f53845b0.setVisibility(0);
            z41Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            z41Var.f53845b0.setVisibility(8);
            z41Var.T.setVisibility(0);
        }
        fh.g c10 = z41Var.getBaseSimpleGlass().f56042c.c(z41Var.f53862p0, c8.g0.f(z41Var.resourceProvider), false);
        org.telegram.messenger.i20.r(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        z41Var.f53862p0.setBackground(c10);
        z41Var.glassEngine.c(z41Var.f53855i0);
        ri.a baseSimpleGlass = z41Var.getBaseSimpleGlass();
        x31 x31Var2 = z41Var.f53855i0;
        org.telegram.ui.ActionBar.w4 w4Var2 = z41Var.simpleActionBar;
        org.telegram.ui.ActionBar.e6 e6Var = z41Var.resourceProvider;
        baseSimpleGlass.f56050m = frameLayout5;
        baseSimpleGlass.f56051n = x31Var2;
        baseSimpleGlass.f56040a.c(x31Var2);
        baseSimpleGlass.g(frameLayout5, w4Var2, e6Var);
        z41Var.f53860n0 = new te.a(0, new w31(z41Var), org.telegram.ui.Components.er.h, 380L, false);
        xd xdVar2 = z41Var.f53857k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = z41Var.getBaseSimpleGlass();
            View view2 = xdVar2.f53179b1.d;
            fh.g c11 = baseSimpleGlass2.f56042c.c(view2, null, false);
            c11.p(c8.g0.l(xdVar2.f53191o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = z41Var.f53857k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            z41Var.m0.addView(transactionTabs, layoutParams);
            z41Var.f53857k0.setTabsPinnedChangedListener(new pu0(z41Var, 20));
            z41Var.f53860n0.a(z41Var.f53857k0.f35726f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new fk(z41Var, 2));
        z41Var.getBaseSimpleGlass().f56052o = new vu(z41Var, frameLayout5, new a6(1, frameLayout5), 1);
        z41Var.getBaseSimpleGlass().f56051n = null;
        z41Var.simpleActionBar.setBackground(null);
        z41Var.f53858l0.setBackground(z41Var.getBaseSimpleGlass().a(z41Var.f53858l0));
        org.telegram.messenger.g0.E2(z41Var.S.f39353e);
        frameLayout5.addView(z41Var.S.f39353e, c8.ja.e(42, 42, 53));
        z41Var.f0();
        z41Var.fragmentView.setBackgroundColor(z41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        z41Var.C0 = new m41(z41Var.X, z41Var.U);
        return z41Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.ActionBar.e2 e2Var2;
        org.telegram.ui.ActionBar.e2 e2Var3 = null;
        int i11 = 0;
        if (i7 == org.telegram.messenger.ns.f25605x5) {
            if (((fi.k6) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.ns.V2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    e2Var = (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack);
                } else {
                    e2Var = null;
                }
                if (e2Var instanceof qn) {
                    ((ActionBarLayout) getParentLayout()).d0(e2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    e2Var2 = (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack2);
                } else {
                    e2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        e2Var3 = (org.telegram.ui.ActionBar.e2) r.b.h(3, fragmentStack2);
                    }
                    if (e2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).d0(e2Var2, false);
                    }
                    finishFragment();
                    if (e2Var3 instanceof an) {
                        wg.h.f(e2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (e2Var2 instanceof ProfileActivity) {
                    wg.h.f(e2Var2, chat, false);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f53870v0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i12);
                    int i13 = this.f53868t0.get(gjVar.e1(), -1);
                    if (i13 >= 0 && ((w41) arrayList.get(i13)).b() == gjVar.e1()) {
                        if (gjVar.Z) {
                            arrayList3.add((w41) arrayList.get(i13));
                        } else {
                            ((w41) arrayList.get(i13)).f52431b = gjVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f53872w0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    w41 w41Var = (w41) arrayList.get(i11);
                    if (w41Var.f52431b == null) {
                        this.f53867s0 = w41Var.b();
                        break;
                    } else {
                        arrayList4.add(w41Var);
                        i11++;
                    }
                }
                if (arrayList4.size() < 20) {
                    k0();
                }
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28052id == this.f53844b && this.f53842a == null) {
                this.f53842a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f53858l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15575b;
            ViewGroup.LayoutParams layoutParams = this.f53858l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f53858l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f53846c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.A3(this.S.f39353e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15575b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f53863q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        z31 z31Var = this.T;
        if (z31Var != null) {
            i0.c cVar = this.mSystemInsets;
            ri.a.e(z31Var, cVar.f15575b, cVar.d, currentActionBarHeight, i7);
        }
        sb sbVar = this.f53856j0;
        if (sbVar != null) {
            org.telegram.ui.Components.uj0 uj0Var = sbVar.G;
            i0.c cVar2 = this.mSystemInsets;
            ri.a.e(uj0Var, cVar2.f15575b, cVar2.d, currentActionBarHeight, i7);
        }
        xd xdVar = this.f53857k0;
        if (xdVar != null) {
            i0.c cVar3 = this.mSystemInsets;
            int i10 = cVar3.f15575b;
            int i11 = cVar3.d;
            xdVar.V0 = i10;
            xdVar.W0 = i11;
            xdVar.X0 = i7;
            int C = org.telegram.messenger.i20.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.i20.C(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.u41 u41Var = xdVar.Y0;
            org.telegram.messenger.g0.A3(u41Var, 0, C, 0, C2);
            u41Var.setPadding(u41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - C, u41Var.getPaddingRight(), (i11 + i7) - C2);
            xdVar.z(-C, -C2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        l41 l41Var;
        l41 l41Var2;
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28957j5));
        if (this.f53847c0) {
            while (i7 < 6) {
                if (i7 == 0) {
                    l41Var2 = this.d;
                } else if (i7 == 1) {
                    l41Var2 = this.I;
                } else if (i7 == 2) {
                    l41Var2 = this.J;
                } else if (i7 == 3) {
                    l41Var2 = this.K;
                } else if (i7 == 4) {
                    l41Var2 = this.L;
                } else {
                    l41Var2 = this.M;
                }
                n0(l41Var2, arrayList, g6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                if (i7 == 0) {
                    l41Var = this.d;
                } else if (i7 == 1) {
                    l41Var = this.h;
                } else if (i7 == 2) {
                    l41Var = this.f53859n;
                } else if (i7 == 3) {
                    l41Var = this.f53864r;
                } else if (i7 == 4) {
                    l41Var = this.f53866s;
                } else if (i7 == 5) {
                    l41Var = this.f53871w;
                } else if (i7 == 6) {
                    l41Var = this.f53875y;
                } else if (i7 == 7) {
                    l41Var = this.f53849e;
                } else if (i7 == 8) {
                    l41Var = this.f53873x;
                } else if (i7 == 9) {
                    l41Var = this.E;
                } else if (i7 == 10) {
                    l41Var = this.F;
                } else {
                    l41Var = this.G;
                }
                n0(l41Var, arrayList, g6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        x31 x31Var;
        if (motionEvent != null && this.f53857k0 != null && (x31Var = this.f53855i0) != null) {
            View currentView = x31Var.getCurrentView();
            xd xdVar = this.f53857k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.f53855i0.getX()) - this.f53857k0.getX(), (motionEvent.getY() - this.f53855i0.getY()) - this.f53857k0.getY())) {
                return false;
            }
        }
        x31 x31Var2 = this.f53855i0;
        if (x31Var2 != null && (x31Var2.f41295b != 0 || x31Var2.f41296c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(l41[] l41VarArr) {
        e41 e41Var = this.X;
        if (e41Var != null) {
            e41Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.f53845b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.F0);
            this.f53845b0.animate().alpha(0.0f).setDuration(230L).setListener(new xx(this, 29));
            this.T.setVisibility(0);
            this.T.setAlpha(0.0f);
            this.T.animate().alpha(1.0f).setDuration(230L).start();
            for (l41 l41Var : l41VarArr) {
                if (l41Var != null && l41Var.d == null && l41Var.f48834f != null) {
                    l41Var.a(this.currentAccount, this.classGuid, this.f53842a.stats_dc, new eh(2, this, l41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f28089id = new ArrayList<>();
        ArrayList arrayList = this.f53870v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f53868t0.get(this.f53867s0); i10 < size; i10++) {
            if (((w41) arrayList.get(i10)).f52431b == null) {
                tL_channels_getMessages.f28089id.add(Integer.valueOf(((w41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(this.f53844b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new s31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f53861o0) {
            return;
        }
        boolean z10 = this.f53847c0;
        long j3 = this.f53844b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.np.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new s31(this, 1), null, null, 0, this.f53842a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f53876y0;
        arrayList.clear();
        ArrayList arrayList2 = this.f53874x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            w41 w41Var = (w41) obj;
            org.telegram.messenger.gj f10 = this.D0.f(w41Var.b());
            if (f10 != null) {
                w41Var.f52431b = f10;
                arrayList.add(w41Var);
            }
        }
        this.f53869u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof k41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.x6) && !this.T.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.fq) {
                org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) background;
                if ((fqVar.f34669a instanceof ColorDrawable) && fqVar.f34670b != null) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28813b7, false);
                    if (this.H0 == null || this.I0 != x02) {
                        this.I0 = x02;
                        this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) fqVar.f34669a).setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false));
                    fqVar.f34670b.setColorFilter(this.H0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.fq fqVar2 = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false)), org.telegram.ui.ActionBar.j6.Y0(org.telegram.messenger.t0.f26600b, 2131231229, org.telegram.ui.ActionBar.j6.f28813b7), 0, 0);
            fqVar2.f34678x = true;
            view.setBackground(fqVar2);
        } else if (view instanceof ng.c) {
            ((ng.c) view).a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.messenger.ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ns.D);
        eVar2.c(org.telegram.messenger.ns.T);
        eVar2.c(org.telegram.messenger.ns.V2);
        eVar2.c(org.telegram.messenger.ns.f25605x5);
        this.G0 = eVar2;
        fi.s6 P1 = getMessagesController().P1();
        long j3 = this.f53844b;
        fi.k6 A = P1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.f53842a != null) {
            l0();
        } else {
            org.telegram.messenger.np.s1(this.currentAccount).V2(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f53854h0;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
            t1VarArr[0] = null;
        }
        fi.k6 k6Var = this.D0;
        if (k6Var != null) {
            k6Var.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        f0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.sn snVar = this.S;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fj, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z10) {
        boolean z11;
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f53865r0;
            if (i10 < bVarArr.length) {
                qh.b bVar = bVarArr[i10];
                if (i10 == i7) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void q0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.f53865r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f53865r0[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.f53862p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f53877z0;
        arrayList.clear();
        arrayList.addAll(this.f53872w0);
        arrayList.addAll(this.f53876y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.qk(4))));
    }

    public final void s0() {
        z31 z31Var = this.T;
        if (z31Var != null) {
            int childCount = z31Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.T.getChildAt(i7));
            }
            int hiddenChildCount = this.T.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.T.V(i10));
            }
            int cachedChildCount = this.T.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.T.P(i11));
            }
            int attachedScrapChildCount = this.T.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.T.O(i12));
            }
            this.T.getRecycledViewPool().a();
        }
        lg.f fVar = this.f53843a0;
        if (fVar != null) {
            fVar.f19401c = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z41.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
