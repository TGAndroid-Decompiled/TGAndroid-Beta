package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class u91 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final z5 B0;
    public PorterDuffColorFilter C0;
    public int D0;
    public g91 E;
    public final bh.f E0;
    public g91 F;
    public final gh.d F0;
    public q91 G;
    public final gh.d G0;
    public g91 H;
    public final gh.c H0;
    public g91 I;
    public final bh.b I0;
    public g91 J;
    public r81 J0;
    public g91 K;
    public final ArrayList K0;
    public g91 L;
    public final RectF L0;
    public g91 M;
    public final RectF M0;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.oo R;
    public v81 S;
    public bh.l T;
    public s4.b0 U;
    public final LruCache V;
    public org.telegram.ui.Components.bk0 W;
    public z81 X;
    public s81 Y;
    public t91 Z;
    public TLRPC.ChatFull f42310a;
    public jg.f f42311a0;
    public final long f42312b;
    public LinearLayout f42313b0;
    public boolean f42314c;
    public final boolean f42315c0;
    public g91 d;
    public final boolean f42316d0;
    public g91 e;
    public final boolean f42317e0;
    public p91 f42318f;
    public long f42319f0;
    public long f42320g0;
    public g91 h;
    public final org.telegram.ui.ActionBar.c2[] f42321h0;
    public ei.h1 f42322i0;
    public cc f42323j0;
    public ie f42324k0;
    public final boolean f42325l0;
    public tg0 m0;
    public g91 f42326n;
    public ph.b[] f42327n0;
    public int f42328o0;
    public final SparseIntArray f42329p0;
    public final SparseIntArray f42330q0;
    public g91 f42331r;
    public final ArrayList f42332r0;
    public g91 f42333s;
    public final ArrayList f42334s0;
    public final ArrayList f42335t0;
    public final ArrayList f42336u0;
    public g91 v;
    public final ArrayList f42337v0;
    public g91 f42338w;
    public boolean f42339w0;
    public g91 f42340x;
    public boolean f42341x0;
    public g91 f42342y;
    public h91 f42343y0;
    public ci.z6 f42344z0;

    public u91(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f42321h0 = new org.telegram.ui.ActionBar.c2[1];
        this.f42328o0 = -1;
        this.f42329p0 = new SparseIntArray();
        this.f42330q0 = new SparseIntArray();
        this.f42332r0 = new ArrayList();
        this.f42334s0 = new ArrayList();
        this.f42335t0 = new ArrayList();
        this.f42336u0 = new ArrayList();
        this.f42337v0 = new ArrayList();
        this.f42341x0 = true;
        this.B0 = new z5(this, 14);
        ArrayList arrayList = new ArrayList();
        this.K0 = arrayList;
        RectF rectF = new RectF();
        this.L0 = rectF;
        RectF rectF2 = new RectF();
        this.M0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f42312b = j10;
        this.f42315c0 = bundle.getBoolean("is_megagroup", false);
        this.f42316d0 = bundle.getBoolean("start_from_boosts", false);
        this.f42317e0 = bundle.getBoolean("start_from_monetization", false);
        this.f42325l0 = bundle.getBoolean("only_boosts", false);
        this.f42310a = getMessagesController().getChatFull(j10);
        gh.c cVar = new gh.c();
        this.H0 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.E0 = new bh.f(false);
            this.F0 = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.G0 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.I0 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            return;
        }
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.I0 = new bh.b(cVar);
    }

    public static void U(u91 u91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(u91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            u91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new o81(u91Var, arrayList, 0));
    }

    public static void V(u91 u91Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = u91Var.N;
        ArrayList arrayList6 = u91Var.O;
        ArrayList arrayList7 = u91Var.f42332r0;
        String str16 = "%";
        int i12 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final g91[] g91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            g91 g91Var = g91VarArr[2];
            if (g91Var != null) {
                g91Var.f37541n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.r a2 = p91.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f40419o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f40420p = (String) a2.f7672b;
            obj.f40421q = (String) a2.e;
            obj.f40422r = ((Boolean) a2.f7673c).booleanValue();
            obj.f40423s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.r a10 = p91.a(tL_broadcastStats.reactions_per_story);
            obj.f40424t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f40425u = (String) a10.f7672b;
            obj.v = (String) a10.e;
            obj.f40426w = ((Boolean) a10.f7673c).booleanValue();
            obj.f40427x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.r a11 = p91.a(tL_broadcastStats.views_per_story);
            obj.f40428y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f40429z = (String) a11.f7672b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7673c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.r a12 = p91.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7672b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7673c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i13 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i13 / ((float) d10)) * 100.0f);
            }
            obj.f40408a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f40409b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i13 == 0 || abs5 == 0.0f) {
                i10 = i13;
                obj.f40410c = "";
            } else {
                int i14 = (int) abs5;
                if (abs5 == i14) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i13 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    obj.f40410c = sb2.toString() + " (" + i14 + "%)";
                    i10 = i13;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i13 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb3.append(str14);
                    sb3.append(AndroidUtilities.formatWholeNumber(i13, 0));
                    i10 = i13;
                    obj.f40410c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i15 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i15 / ((float) d12)) * 100.0f);
            }
            obj.f40413i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f40414j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i15 != 0 && abs6 != 0.0f) {
                int i16 = (int) abs6;
                if (abs6 == i16) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i15 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb4.append(str13);
                    sb4.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f40415k = sb4.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i15 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb5.append(str12);
                    sb5.append(AndroidUtilities.formatWholeNumber(i15, 0));
                    obj.f40415k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f40415k = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f40416l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i17 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i17 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f40411f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i17 != 0 && abs7 != 0.0f) {
                int i18 = (int) abs7;
                if (abs7 == i18) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i17 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb6.append(str11);
                    sb6.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f40412g = sb6.toString() + " (" + i18 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i17 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb7.append(str10);
                    sb7.append(AndroidUtilities.formatWholeNumber(i17, 0));
                    obj.f40412g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f40412g = "";
            }
            if (i17 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f40417m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i19 = (int) f7;
            if (f7 == i19) {
                Locale locale7 = Locale.ENGLISH;
                obj.f40418n = a1.g.m(i19, "%");
            } else {
                obj.f40418n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            u91Var.f42318f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            u91Var.f42319f0 = tL_statsDateRangeDays.max_date * 1000;
            u91Var.f42320g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i22 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i22);
                int i23 = i22 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f41064a = postInteractionCounters2;
                int i24 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i23;
                    u91Var.f42329p0.put(obj2.b(), i20);
                    i20++;
                } else {
                    i11 = i23;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    u91Var.f42335t0.add(obj2);
                    u91Var.f42330q0.put(obj2.b(), i21);
                    i21++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i22 = i11;
                arrayList8 = arrayList4;
                size = i24;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new o81(u91Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                u91Var.getMessagesStorage().getMessages(-u91Var.f42312b, 0L, false, arrayList12.size(), ((r91) arrayList12.get(0)).b(), 0, 0, u91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(u91Var) {
                public final u91 f39818b;

                {
                    this.f39818b = u91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            u91 u91Var2 = this.f39818b;
                            u91Var2.getClass();
                            g91[] g91VarArr2 = g91VarArr;
                            u91Var2.d = g91VarArr2[0];
                            u91Var2.H = g91VarArr2[1];
                            u91Var2.I = g91VarArr2[2];
                            u91Var2.J = g91VarArr2[3];
                            u91Var2.K = g91VarArr2[4];
                            u91Var2.L = g91VarArr2[5];
                            u91Var2.e = g91VarArr2[6];
                            u91Var2.M = g91VarArr2[7];
                            u91Var2.g0(g91VarArr2);
                            return;
                        default:
                            u91 u91Var3 = this.f39818b;
                            u91Var3.getClass();
                            g91[] g91VarArr3 = g91VarArr;
                            u91Var3.f42331r = g91VarArr3[0];
                            u91Var3.h = g91VarArr3[1];
                            u91Var3.e = g91VarArr3[2];
                            u91Var3.f42326n = g91VarArr3[3];
                            u91Var3.d = g91VarArr3[4];
                            u91Var3.f42333s = g91VarArr3[5];
                            u91Var3.v = g91VarArr3[6];
                            u91Var3.f42338w = g91VarArr3[7];
                            u91Var3.f42340x = g91VarArr3[8];
                            u91Var3.f42342y = g91VarArr3[9];
                            u91Var3.E = g91VarArr3[10];
                            u91Var3.F = g91VarArr3[11];
                            u91Var3.g0(g91VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final g91[] g91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            g91 g91Var2 = g91VarArr2[6];
            if (g91Var2 != null) {
                g91Var2.f37541n = true;
            }
            g91 g91Var3 = g91VarArr2[7];
            if (g91Var3 != null) {
                g91Var3.f37542o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i25 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i25 / ((float) d16)) * 100.0f);
            }
            obj3.f40668a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f40669b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i25 != 0 && abs != 0.0f) {
                int i26 = (int) abs;
                if (abs == i26) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i25 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb8.append(str8);
                    sb8.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f40670c = sb8.toString() + " (" + i26 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i25 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb9.append(str7);
                    sb9.append(AndroidUtilities.formatWholeNumber(i25, 0));
                    obj3.f40670c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f40670c = "";
            }
            if (i25 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i27 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i27 / ((float) d18)) * 100.0f);
            }
            obj3.f40673i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f40674j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i27 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i27 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb10.append(str6);
                sb10.append(AndroidUtilities.formatWholeNumber(i27, 0));
                obj3.f40675k = sb10.toString();
            } else {
                obj3.f40675k = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f40676l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i28 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i28 / ((float) d20)) * 100.0f);
            }
            obj3.f40677m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f40678n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i28 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i28 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb11.append(str5);
                sb11.append(AndroidUtilities.formatWholeNumber(i28, 0));
                obj3.f40679o = sb11.toString();
            } else {
                obj3.f40679o = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f40680p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i29 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i29 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f40671f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i29 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i29 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb12.append(str4);
                sb12.append(AndroidUtilities.formatWholeNumber(i29, 0));
                obj3.f40672g = sb12.toString();
            } else {
                obj3.f40672g = "";
            }
            if (i29 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            u91Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            u91Var.f42319f0 = tL_statsDateRangeDays2.max_date * 1000;
            u91Var.f42320g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i30 = 0;
                while (i30 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i30);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f39831a = n91.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb13 = new StringBuilder();
                    int i31 = tL_statsGroupTopPoster.messages;
                    if (i31 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f39832b = sb13.toString();
                    int i32 = i12;
                    if (arrayList2.size() < i32) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i30++;
                    arrayList2 = arrayList3;
                    i12 = i32;
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
                for (int i33 = 0; i33 < tL_megagroupStats.top_admins.size(); i33++) {
                    ArrayList arrayList19 = u91Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i33);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f39831a = n91.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb14 = new StringBuilder();
                    int i34 = tL_statsGroupTopAdmin.deleted;
                    if (i34 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i34, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f39832b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i35 = 0; i35 < tL_megagroupStats.top_inviters.size(); i35++) {
                    ArrayList arrayList22 = u91Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i35);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f39831a = n91.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i36 = tL_statsGroupTopInviter.invitations;
                    if (i36 > 0) {
                        obj6.f39832b = LocaleController.formatPluralString("Invitations", i36, new Object[0]);
                    } else {
                        obj6.f39832b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(u91Var) {
                public final u91 f39818b;

                {
                    this.f39818b = u91Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            u91 u91Var2 = this.f39818b;
                            u91Var2.getClass();
                            g91[] g91VarArr22 = g91VarArr2;
                            u91Var2.d = g91VarArr22[0];
                            u91Var2.H = g91VarArr22[1];
                            u91Var2.I = g91VarArr22[2];
                            u91Var2.J = g91VarArr22[3];
                            u91Var2.K = g91VarArr22[4];
                            u91Var2.L = g91VarArr22[5];
                            u91Var2.e = g91VarArr22[6];
                            u91Var2.M = g91VarArr22[7];
                            u91Var2.g0(g91VarArr22);
                            return;
                        default:
                            u91 u91Var3 = this.f39818b;
                            u91Var3.getClass();
                            g91[] g91VarArr3 = g91VarArr2;
                            u91Var3.f42331r = g91VarArr3[0];
                            u91Var3.h = g91VarArr3[1];
                            u91Var3.e = g91VarArr3[2];
                            u91Var3.f42326n = g91VarArr3[3];
                            u91Var3.d = g91VarArr3[4];
                            u91Var3.f42333s = g91VarArr3[5];
                            u91Var3.v = g91VarArr3[6];
                            u91Var3.f42338w = g91VarArr3[7];
                            u91Var3.f42340x = g91VarArr3[8];
                            u91Var3.f42342y = g91VarArr3[9];
                            u91Var3.E = g91VarArr3[10];
                            u91Var3.F = g91VarArr3[11];
                            u91Var3.g0(g91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(u91 u91Var) {
        float f7;
        RectF rectF = u91Var.M0;
        bh.f fVar = u91Var.E0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null && u91Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (u91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            u91Var.L0.set(0.0f, -dp, u91Var.fragmentView.getMeasuredWidth(), u91Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), u91Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            fVar.g(2, u91Var.K0);
            fVar.e(u91Var.J0, u91Var.fragmentView.getMeasuredWidth(), u91Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(u91 u91Var) {
        View currentView = u91Var.f42322i0.getCurrentView();
        cc ccVar = u91Var.f42323j0;
        if (currentView == ccVar) {
            u91Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        ie ieVar = u91Var.f42324k0;
        if (currentView == ieVar) {
            u91Var.actionBar.setAdaptiveBackground(ieVar.f38154a1);
        } else {
            u91Var.actionBar.setAdaptiveBackground(u91Var.S);
        }
    }

    public static void Z(u91 u91Var) {
        t91 t91Var = u91Var.Z;
        if (t91Var != null) {
            t91Var.f41931b = true;
        }
        int childCount = u91Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u91Var.S.getChildAt(i10);
            if (childAt instanceof f91) {
                ((f91) childAt).f36879b.f14525t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f20343id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20343id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new u91(bundle);
        }
        return new y5(-chat.f20343id);
    }

    public static kg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new kg.b(jSONObject);
        }
        if (i10 == 1) {
            return new kg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new kg.b(jSONObject);
            int length = ((kg.a) bVar.d.get(0)).f15092a.length;
            int size = bVar.d.size();
            bVar.f15107l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f15107l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f15107l;
                    jArr[i11] = jArr[i11] + ((kg.a) bVar.d.get(i12)).f15092a[i11];
                }
            }
            bVar.f15108m = new SegmentTree(bVar.f15107l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new kg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f15098a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((kg.a) bVar2.d.get(i13)).f15092a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f15098a.length / 2.0f) {
                        arrayList.add((kg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((kg.a) obj);
                }
            }
            int length3 = ((kg.a) bVar2.d.get(0)).f15092a.length;
            int size3 = bVar2.d.size();
            bVar2.f15109l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f15109l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f15109l;
                    jArr3[i17] = jArr3[i17] + ((kg.a) bVar2.d.get(i18)).f15092a[i17];
                }
            }
            new SegmentTree(bVar2.f15109l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static g91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        g91 g91Var = new g91(str, i10);
        g91Var.f37540m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                kg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                g91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                g91Var.f37535g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f15098a) == null || jArr2.length < 2) {
                    g91Var.f37539l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f15098a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    g91Var.e = new kg.e(e02, j10);
                    g91Var.f37533c = j10;
                    return g91Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            g91Var.f37534f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return g91Var;
    }

    public static void k0(g91 g91Var, ArrayList arrayList, org.telegram.ui.ActionBar.s6 s6Var) {
        kg.b bVar;
        int i10;
        if (g91Var != null && (bVar = g91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                kg.a aVar = (kg.a) obj;
                int i12 = aVar.f15096g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.k6.e1(i12)) {
                        int i13 = aVar.f15096g;
                        if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                            i10 = aVar.f15097i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.k6.x1(i13, i10, false);
                        org.telegram.ui.ActionBar.k6.ql[aVar.f15096g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, aVar.f15096g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21516v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21499u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21553x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21254h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.bj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21289j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        tg0 tg0Var = this.m0;
        if (tg0Var != null) {
            tg0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f42314c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        v81 v81Var = this.S;
        if (v81Var != null) {
            v81Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        cc ccVar = this.f42323j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ie ieVar = this.f42324k0;
        if (ieVar != null) {
            ieVar.f38154a1.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        boolean z13;
        float f7;
        String str;
        org.telegram.ui.ActionBar.h5 h5Var;
        FrameLayout frameLayout2;
        boolean z14;
        u91 u91Var = this;
        u91Var.f42311a0 = new jg.f(null);
        MessagesController messagesController = MessagesController.getInstance(u91Var.currentAccount);
        long j10 = u91Var.f42312b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(u91Var.currentAccount).getChatFull(j10);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.I, R.string.Statistics));
        }
        arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(ph.b.c(context, u91Var.resourceProvider, ph.a.MONETIZATION, R.string.Monetization));
        }
        u91Var.f42327n0 = (ph.b[]) arrayList.toArray(new ph.b[0]);
        tg0 tg0Var = new tg0(context, u91Var.resourceProvider);
        u91Var.m0 = tg0Var;
        tg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = u91Var.f42327n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            ph.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ai.n1(u91Var, i11, 27));
            u91Var.m0.addView(u91Var.f42327n0[i11]);
            u91Var.m0.i(bVar, true, false);
            i11++;
        }
        u91Var.f42322i0 = new ei.h1(u91Var, u91Var.getParentActivity(), 7);
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (isBoostSupported) {
            u91Var.f42323j0 = new cc(u91Var, -j10, u91Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = u91Var.getParentActivity();
            int i12 = u91Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                frameLayout2 = frameLayout3;
                z14 = true;
            } else {
                frameLayout2 = frameLayout3;
                z14 = false;
            }
            frameLayout = frameLayout2;
            ie ieVar = new ie(parentActivity, this, i12, j11, resourceProvider, z14, chatFull.can_view_stars_revenue);
            u91Var = this;
            u91Var.f42324k0 = ieVar;
            ieVar.setActionBar(u91Var.actionBar);
        } else {
            frameLayout = frameLayout3;
        }
        boolean z15 = z10;
        FrameLayout frameLayout4 = frameLayout;
        u91Var.f42322i0.setAdapter(new u81(u91Var, z15, isBoostSupported, z11, frameLayout4));
        boolean z16 = u91Var.f42325l0;
        if (isBoostSupported && !z16) {
            z12 = true;
        } else {
            z12 = false;
        }
        u91Var.f42314c = z12;
        if (z12 && u91Var.f42316d0) {
            u91Var.f42322i0.setPosition(z15 ? 1 : 0);
        } else if (z12 && u91Var.f42317e0) {
            ei.h1 h1Var = u91Var.f42322i0;
            if (!z16 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            h1Var.setPosition((z15 ? 1 : 0) + i10);
        }
        u91Var.m0(u91Var.f42322i0.getCurrentPosition(), false);
        y8 y8Var = new y8(u91Var, u91Var.getParentActivity(), 8);
        u91Var.actionBar.setDrawBlurBackground(y8Var);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, y8Var, u91Var.getResourceProvider());
        ih.k kVar = new ih.k(y8Var);
        bh.b bVar2 = u91Var.I0;
        bVar2.f4365f = kVar;
        bVar2.f4366g = y8Var;
        y8Var.addView(u91Var.f42322i0, w7.z5.g());
        y8Var.addView(u91Var.actionBar);
        if (u91Var.f42314c) {
            y8Var.addView(u91Var.m0, w7.z5.e(344, 72, 81));
            u91Var.setBulletinDelegate(new ei.o8(12));
        }
        u91Var.fragmentView = y8Var;
        v81 v81Var = new v81(u91Var, context);
        u91Var.S = v81Var;
        v81Var.setSections(true);
        u91Var.S.setClipToPadding(false);
        v81 v81Var2 = u91Var.S;
        Objects.requireNonNull(v81Var2);
        u91Var.T = new bh.l(v81Var2, y8Var, new ns(v81Var2, 1));
        cc ccVar = u91Var.f42323j0;
        if (ccVar != null) {
            org.telegram.ui.Components.mm0 mm0Var = ccVar.F;
            Objects.requireNonNull(mm0Var);
            ccVar.G = new bh.l(mm0Var, y8Var, new ns(mm0Var, 0));
            u91Var.f42323j0.F.j(new t81(u91Var, 1));
        }
        ie ieVar2 = u91Var.f42324k0;
        if (ieVar2 != null) {
            org.telegram.ui.Components.j71 j71Var = ieVar2.f38154a1;
            Objects.requireNonNull(j71Var);
            ieVar2.f38155b1 = new bh.l(j71Var, y8Var, new x8(j71Var, 0));
            u91Var.f42324k0.f38154a1.j(new t81(u91Var, 2));
        }
        u91Var.J0 = new r81(u91Var, y8Var);
        u91Var.S.t1();
        LinearLayout linearLayout = new LinearLayout(context);
        u91Var.f42313b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        u91Var.W = imageView;
        imageView.setAutoRepeat(true);
        u91Var.W.f(R.raw.statistic_preload, 120, 120, null);
        u91Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        org.telegram.ui.ActionBar.r6.W(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        org.telegram.ui.ActionBar.r6.W(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.sl.m(R.string.LoadingStatsDescription, textView2, 1);
        u91Var.f42313b0.addView(u91Var.W, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        u91Var.f42313b0.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        u91Var.f42313b0.addView(textView2, w7.z5.q(-2, -2, 1));
        frameLayout4.addView(u91Var.f42313b0, w7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (u91Var.X == null) {
            u91Var.X = new z81(u91Var);
        }
        u91Var.S.setAdapter(u91Var.X);
        s4.b0 b0Var = new s4.b0();
        u91Var.U = b0Var;
        u91Var.S.setLayoutManager(b0Var);
        u91Var.Y = new s4.k();
        u91Var.S.setItemAnimator(null);
        u91Var.S.j(new t81(u91Var, 0));
        u91Var.S.setOnItemClickListener(new j11(u91Var, 7));
        u91Var.S.setOnItemLongClickListener(new sp0(u91Var, 17));
        frameLayout4.addView(u91Var.S);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, null, false, null);
        u91Var.R = ooVar;
        if (AndroidUtilities.isTablet() && ((h5Var = u91Var.parentLayout) == null || !((ActionBarLayout) h5Var).f20616b)) {
            z13 = false;
        } else {
            z13 = true;
        }
        ooVar.setOccupyStatusBar(z13);
        u91Var.R.getAvatarImageView().setScaleX(0.9f);
        u91Var.R.getAvatarImageView().setScaleY(0.9f);
        u91Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar2 = u91Var.actionBar;
        org.telegram.ui.Components.oo ooVar2 = u91Var.R;
        if (!u91Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(ooVar2, 0, w7.z5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = u91Var.getMessagesController().getChat(Long.valueOf(j10));
        u91Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.oo ooVar3 = u91Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        ooVar3.setTitle(str);
        org.telegram.ui.Components.oo ooVar4 = u91Var.R;
        if (ooVar4.getSubtitleTextView() != null) {
            ooVar4.getSubtitleTextView().setVisibility(8);
        }
        i2.o1.y(false, u91Var.actionBar);
        u91Var.actionBar.setActionBarMenuOnItemClick(new c31(u91Var, 5));
        u91Var.R.i(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        org.telegram.ui.ActionBar.r6.m(u91Var.actionBar, 1, i13, null);
        org.telegram.ui.ActionBar.r6.b(u91Var.actionBar, i13, null, true);
        org.telegram.ui.ActionBar.r6.m(u91Var.actionBar, 3, org.telegram.ui.ActionBar.k6.f21590z8, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, u91Var.actionBar, null);
        boolean z17 = u91Var.f42341x0;
        z5 z5Var = u91Var.B0;
        if (z17) {
            u91Var.f42313b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(z5Var, 500L);
            u91Var.f42313b0.setVisibility(0);
            u91Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            u91Var.f42313b0.setVisibility(8);
            u91Var.S.setVisibility(0);
        }
        dh.d c10 = bVar2.c(u91Var.m0, fh.c.f(u91Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        u91Var.m0.setBackground(c10);
        u91Var.c0();
        u91Var.f42343y0 = new h91(u91Var.X, u91Var.U);
        return u91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        org.telegram.ui.ActionBar.o2 o2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ci.z6) objArr[0]) == this.f42344z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f42343y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (o2Var instanceof ko) {
                    ((ActionBarLayout) getParentLayout()).b0(o2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack2);
                } else {
                    o2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        o2Var3 = (org.telegram.ui.ActionBar.o2) si.o0.g(3, fragmentStack2);
                    }
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).b0(o2Var2, false);
                    }
                    finishFragment();
                    if (o2Var3 instanceof sn) {
                        ug.h.f(o2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (o2Var2 instanceof ProfileActivity) {
                    ug.h.f(o2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f42332r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f42329p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((r91) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((r91) arrayList.get(i14));
                        } else {
                            ((r91) arrayList.get(i14)).f41065b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f42334s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    r91 r91Var = (r91) arrayList.get(i12);
                    if (r91Var.f41065b == null) {
                        this.f42328o0 = r91Var.b();
                        break;
                    } else {
                        arrayList4.add(r91Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f42343y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20344id == this.f42312b && this.f42310a == null) {
                this.f42310a = chatFull;
                i0();
            }
        }
    }

    public final void g0(g91[] g91VarArr) {
        z81 z81Var = this.X;
        if (z81Var != null) {
            z81Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f42341x0 = false;
        LinearLayout linearLayout = this.f42313b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f42313b0.animate().alpha(0.0f).setDuration(230L).setListener(new v70(this, 27));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (g91 g91Var : g91VarArr) {
                if (g91Var != null && g91Var.d == null && g91Var.f37534f != null) {
                    g91Var.a(this.currentAccount, this.classGuid, this.f42310a.stats_dc, new oh(2, this, g91Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.n5 n5Var;
        g91 g91Var;
        g91 g91Var2;
        i6 i6Var = new i6(22, this);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{lg.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21289j5));
        org.telegram.ui.Components.oo ooVar = this.R;
        View view = null;
        if (ooVar != null) {
            n5Var = ooVar.getTitleTextView();
        } else {
            n5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        org.telegram.ui.Components.oo ooVar2 = this.R;
        if (ooVar2 != null) {
            view = ooVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(org.telegram.ui.ActionBar.k6.Pi, view));
        if (this.f42315c0) {
            while (i10 < 6) {
                if (i10 == 0) {
                    g91Var2 = this.d;
                } else if (i10 == 1) {
                    g91Var2 = this.H;
                } else if (i10 == 2) {
                    g91Var2 = this.I;
                } else if (i10 == 3) {
                    g91Var2 = this.J;
                } else if (i10 == 4) {
                    g91Var2 = this.K;
                } else {
                    g91Var2 = this.L;
                }
                k0(g91Var2, arrayList, i6Var);
                i10++;
            }
        } else {
            while (i10 < 12) {
                if (i10 == 0) {
                    g91Var = this.d;
                } else if (i10 == 1) {
                    g91Var = this.h;
                } else if (i10 == 2) {
                    g91Var = this.f42326n;
                } else if (i10 == 3) {
                    g91Var = this.f42331r;
                } else if (i10 == 4) {
                    g91Var = this.f42333s;
                } else if (i10 == 5) {
                    g91Var = this.v;
                } else if (i10 == 6) {
                    g91Var = this.f42340x;
                } else if (i10 == 7) {
                    g91Var = this.e;
                } else if (i10 == 8) {
                    g91Var = this.f42338w;
                } else if (i10 == 9) {
                    g91Var = this.f42342y;
                } else if (i10 == 10) {
                    g91Var = this.E;
                } else {
                    g91Var = this.F;
                }
                k0(g91Var, arrayList, i6Var);
                i10++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f20381id = new ArrayList<>();
        ArrayList arrayList = this.f42332r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f42329p0.get(this.f42328o0); i11 < size; i11++) {
            if (((r91) arrayList.get(i11)).f41065b == null) {
                tL_channels_getMessages.f20381id.add(Integer.valueOf(((r91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f42312b);
        this.f42339w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new q81(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f42325l0) {
            return;
        }
        boolean z10 = this.f42315c0;
        long j10 = this.f42312b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new q81(this, 1), null, null, 0, this.f42310a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false)) <= 0.699999988079071d) {
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
        ei.h1 h1Var = this.f42322i0;
        if (h1Var != null && (h1Var.f28307b != 0 || h1Var.f28308c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f42336u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f42335t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r91 r91Var = (r91) obj;
            MessageObject f7 = this.f42344z0.f(r91Var.b());
            if (f7 != null) {
                r91Var.f41065b = f7;
                arrayList.add(r91Var);
            }
        }
        this.f42330q0.clear();
        arrayList2.clear();
    }

    public final void l0(View view) {
        if (view instanceof f91) {
            return;
        }
        if (view instanceof org.telegram.ui.Cells.b7) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.yq) {
                org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) background;
                if ((yqVar.f33012a instanceof ColorDrawable) && yqVar.f33013b != null) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21145b7, false);
                    if (this.C0 == null || this.D0 != x02) {
                        this.D0 = x02;
                        this.C0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) yqVar.f33012a).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
                    yqVar.f33013b.setColorFilter(this.C0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.yq yqVar2 = new org.telegram.ui.Components.yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false)), org.telegram.ui.ActionBar.k6.X0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7), 0, 0);
            yqVar2.f33019w = true;
            view.setBackground(yqVar2);
        } else if (view instanceof lg.c) {
            ((lg.c) view).a();
        }
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.f42327n0;
            if (i11 < bVarArr.length) {
                ph.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f42327n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            ph.b bVar = this.f42327n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f42337v0;
        arrayList.clear();
        arrayList.addAll(this.f42334s0);
        arrayList.addAll(this.f42336u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.w0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ci.h7 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f42312b;
        ci.z6 A = storiesController.A(-j10, 2, -1, true);
        this.f42344z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f42310a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.f42321h0;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
            c2VarArr[0] = null;
        }
        ci.z6 z6Var = this.f42344z0;
        if (z6Var != null) {
            z6Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            this.H0.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
            org.telegram.ui.Components.oo ooVar = this.R;
            if (ooVar != null) {
                ooVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oi, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pi, false));
            }
            p0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        v81 v81Var = this.S;
        if (v81Var != null) {
            int childCount = v81Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                l0(this.S.getChildAt(i10));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                l0(this.S.V(i11));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                l0(this.S.P(i12));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                l0(this.S.O(i13));
            }
            this.S.getRecycledViewPool().a();
        }
        jg.f fVar = this.f42311a0;
        if (fVar != null) {
            fVar.f14474g = true;
        }
    }
}
