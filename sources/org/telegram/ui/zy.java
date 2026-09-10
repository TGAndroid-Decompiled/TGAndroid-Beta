package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class zy extends org.telegram.ui.ActionBar.k {
    public final fz f39464a;

    public zy(fz fzVar) {
        this.f39464a = fzVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        fz fzVar = this.f39464a;
        int i12 = fzVar.f32943w;
        ArrayList arrayList = fzVar.e;
        int i13 = fzVar.f32944x;
        if (i10 == -1) {
            if (fzVar.f32945y == null) {
                fzVar.Y();
            } else {
                fzVar.finishFragment();
            }
        } else if (i10 == 1 && fzVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            fzVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = fzVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.p2) fzVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(fzVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(fzVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(fzVar.getParentActivity(), appWidgetManager, i13);
            }
            a1 a1Var = fzVar.f32945y;
            if (a1Var != null) {
                int i15 = a1Var.f30764a;
                Object obj = a1Var.f30765b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            fzVar.Y();
        }
    }
}
