package wh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String B;
    public String C;
    public TLRPC.InputFile D;
    public boolean E;
    public final int f50110a;
    public final String f50111b;
    public final boolean f50112c;
    public final boolean d;
    public final boolean f50113e;
    public final int f50114f;
    public final int h;
    public final int f50115n;
    public final TLRPC.Document f50116r;
    public final t4 f50117s;
    public boolean v;
    public boolean f50118w;
    public boolean f50119x;
    public int f50120y;

    public u4(int i10, String str, boolean z4, int i11, int i12, int i13, e3 e3Var) {
        this.f50110a = i10;
        this.f50111b = str;
        this.f50112c = z4;
        this.d = false;
        this.f50113e = false;
        this.f50114f = i11;
        this.h = i12;
        this.f50115n = i13;
        this.f50116r = null;
        this.f50117s = e3Var;
    }

    public final void a(String str) {
        int i10;
        boolean z4;
        if (!this.f50118w && !this.f50119x) {
            this.B = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f50110a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f50112c) {
                i10 = 33554432;
            } else if (this.d) {
                i10 = 50331648;
            } else if (this.f50113e) {
                i10 = 67108864;
            } else {
                i10 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f50110a);
            String str2 = this.B;
            if (!this.f50112c && !this.d && !this.f50113e) {
                z4 = true;
            } else {
                z4 = false;
            }
            fileLoader.uploadFile(str2, false, z4, i10);
        }
    }

    public final void b() {
        if (!this.f50119x && !this.f50118w) {
            this.f50118w = true;
            try {
                if (this.B != null) {
                    FileLoader.getInstance(this.f50110a).cancelFileUpload(this.B, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f50120y != 0) {
                ConnectionsManager.getInstance(this.f50110a).cancelRequest(this.f50120y, true);
                this.f50120y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f50112c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f50115n;
            tL_documentAttributeVideo.f20852w = this.f50114f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z4 = this.d;
            boolean z10 = this.f50113e;
            if (!z4 && !z10) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f50116r;
                if (z10) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z10) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z10) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            }
        }
        this.f50120y = ConnectionsManager.getInstance(this.f50110a).sendRequest(tL_messages_uploadMedia, new gf.a(this, 29));
    }

    public final void d() {
        int i10;
        int i11;
        if (!this.v && !this.f50118w && !this.f50119x) {
            this.v = true;
            if (this.f50112c) {
                t4 t4Var = this.f50117s;
                int i12 = this.f50114f;
                if (i12 > 0 && (i11 = this.h) > 0) {
                    t4Var.a(i12, i11);
                }
                a(this.f50111b);
            } else if (this.f50113e) {
                Utilities.globalQueue.postRunnable(new s4(this, 0));
            } else if (this.d) {
                a(this.f50111b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f50111b, options);
                    int i13 = options.outWidth;
                    if (i13 > 0 && (i10 = options.outHeight) > 0) {
                        this.f50117s.a(i13, i10);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new s4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i11 == this.f50110a && !this.f50118w && !this.f50119x) {
            String str = (String) objArr[0];
            if (this.B != null && this.B.equals(str)) {
                if (i10 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f50113e && !this.E && !TextUtils.isEmpty(this.C)) {
                        this.D = inputFile2;
                        this.E = true;
                        this.B = this.C;
                        FileLoader.getInstance(this.f50110a).uploadFile(this.B, false, true, 16777216);
                    } else if (this.f50113e && this.E) {
                        c(this.D, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i10 == NotificationCenter.fileUploadFailed) {
                    if (this.f50113e && this.E && (inputFile = this.D) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f50119x = true;
                    e();
                    this.f50117s.onError();
                } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    t4 t4Var = this.f50117s;
                    if (!this.E) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        t4Var.f(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f50110a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public u4(int i10, String str, TLRPC.Document document, c3 c3Var) {
        this.f50110a = i10;
        this.f50111b = str;
        this.f50112c = false;
        this.d = true;
        this.f50113e = false;
        this.f50114f = 0;
        this.h = 0;
        this.f50115n = 0;
        this.f50116r = document;
        this.f50117s = c3Var;
    }

    public u4(int i10, String str, TLRPC.Document document, b3 b3Var) {
        this.f50110a = i10;
        this.f50111b = str;
        this.f50112c = false;
        this.d = false;
        this.f50113e = true;
        this.f50114f = 0;
        this.h = 0;
        this.f50115n = 0;
        this.f50116r = document;
        this.f50117s = b3Var;
    }
}
