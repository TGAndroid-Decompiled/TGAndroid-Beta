package p3;

import a8.wb;
import a8.wd;
import b2.u0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a extends wd {
    public static final Pattern f46637c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f46638a = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder f46639b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override
    public final u0 b(l3.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f46639b;
        CharsetDecoder charsetDecoder2 = this.f46638a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new u0(new c(null, null, bArr));
        }
        Matcher matcher = f46637c.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c10 = wb.c(group);
                c10.getClass();
                if (!c10.equals("streamurl")) {
                    if (c10.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new u0(new c(str2, str3, bArr));
    }
}
