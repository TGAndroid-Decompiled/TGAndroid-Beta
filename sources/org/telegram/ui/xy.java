package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class xy extends org.telegram.ui.ActionBar.j {
    public final dz f39640a;

    public xy(dz dzVar) {
        this.f39640a = dzVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        dz dzVar = this.f39640a;
        int i12 = dzVar.f33130w;
        ArrayList arrayList = dzVar.e;
        int i13 = dzVar.f33131x;
        if (i10 == -1) {
            if (dzVar.f33132y == null) {
                dzVar.Y();
            } else {
                dzVar.finishFragment();
            }
        } else if (i10 == 1 && dzVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            dzVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = dzVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.n2) dzVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(dzVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(dzVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(dzVar.getParentActivity(), appWidgetManager, i13);
            }
            y0 y0Var = dzVar.f33132y;
            if (y0Var != null) {
                int i15 = y0Var.f39652a;
                Object obj = y0Var.f39653b;
                switch (i15) {
                    case 26:
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
            dzVar.Y();
        }
    }
}
