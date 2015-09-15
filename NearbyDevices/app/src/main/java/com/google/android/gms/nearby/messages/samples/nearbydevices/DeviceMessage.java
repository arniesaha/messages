package com.google.android.gms.nearby.messages.samples.nearbydevices;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.google.android.gms.nearby.messages.Message;
import com.google.gson.Gson;
import java.nio.charset.Charset;

/**
 * Used to prepare the payload for a
 * {@link com.google.android.gms.nearby.messages.Message Nearby Message}. Adds a unique id (an
 * InstanceID) to the Message payload, which helps Nearby distinguish between multiple devices with
 * the same model name.
 */
public class DeviceMessage{

    private static final Gson gson = new Gson();
    private String mInstanceId;
    private String mMessageBody;
    private String mUserProfile;
    private  String bitmap;
    private static Context context = MyApp.getContext();
    /**
     * Builds a new {@link Message} object using a unique identifier.
     */
    public static Message newNearbyMessage(String instanceId) {
        DeviceMessage deviceMessage = new DeviceMessage(instanceId);
        return new Message(gson.toJson(deviceMessage).toString().getBytes(Charset.forName("UTF-8")));
    }


    /**
     * Creates a {@code DeviceMessage} object from the string used to construct the payload to a
     * {@code Nearby} {@code Message}.
     */
    public static DeviceMessage fromNearbyMessage(Message message) {
        String nearbyMessageString = new String(message.getContent()).trim();
        return gson.fromJson(
                (new String(nearbyMessageString.getBytes(Charset.forName("UTF-8")))),
                DeviceMessage.class);
    }

    private DeviceMessage(String instanceId) {
        this.mInstanceId = instanceId;
        this.mMessageBody = "Cutting Chai "+Build.MODEL+" "+instanceId;
        this.mUserProfile = "The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. The quick brown fox jumps over the lazy dog 0123456789. Name\n" +
                "\n" +
                "    OES_compressed_ETC1_RGB8_texture:\n" +
                "\n" +
                "Name Strings\n" +
                "\n" +
                "    GL_OES_compressed_ETC1_RGB8_texture\n" +
                "\n" +
                "Contact\n" +
                "\n" +
                "    Jacob Strom (jacob.strom 'at' ericsson.com)\n" +
                "\n" +
                "Notice\n" +
                "\n" +
                "    Copyright (c) 2005-2013 The Khronos Group Inc. Copyright terms at\n" +
                "        http://www.khronos.org/registry/speccopyright.html\n" +
                "\n" +
                "IP Status\n" +
                "\n" +
                "    See Ericsson's \"IP Statement\"\n" +
                "\n" +
                "Status\n" +
                "\n" +
                "    Ratified by the Khronos BOP, July 22, 2005.\n" +
                "\n" +
                "Version\n" +
                "\n" +
                "    Last Modified Date: April 24, 2008\n" +
                "\n" +
                "Number\n" +
                "\n" +
                "    OpenGL ES Extension #5\n" +
                "\n" +
                "Dependencies\n" +
                "\n" +
                "    Written based on the wording of the OpenGL ES 1.0 specification\n" +
                "\n" +
                "Overview\n" +
                "\n" +
                "    The goal of this extension is to allow direct support of\n" +
                "    compressed textures in the Ericsson Texture Compression (ETC)\n" +
                "    formats in OpenGL ES.\n" +
                "\n" +
                "    ETC-compressed textures are handled in OpenGL ES using the\n" +
                "    CompressedTexImage2D call.\n" +
                "\n" +
                "    The definition of the \"internalformat\" parameter in the\n" +
                "    CompressedTexImage2D call has been extended to support\n" +
                "    ETC-compressed textures. \n" +
                "\n" +
                "\n" +
                "Issues\n" +
                "\n" +
                "    Question: \"How does the data format correspond to compressed files\n" +
                "    created with tool etcpack?\"\n" +
                "\n" +
                "    If etcpack is used to convert a .ppm file to this format, the top\n" +
                "    left pixel in the .ppm image will end up in the first block, which\n" +
                "    in turn will end up at u=0, v=0 when sent to\n" +
                "    glCompressedTexImage2D. Thus it works exactly the same way as just\n" +
                "    sending the raw image data from the .ppm format directly to\n" +
                "    glTexImage2D.\n" +
                "\n" +
                "New Procedures and Functions\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "\n" +
                "New Tokens\n" +
                "\n" +
                "    Accepted by the <internalformat> parameter of CompressedTexImage2D\n" +
                "\n" +
                "    ETC1_RGB8_OES           0x8D64\n" +
                "\n" +
                "Additions to Chapter 2 of the OpenGL 1.3 Specification (OpenGL\n" +
                "Operation)\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "Additions to Chapter 3 of the OpenGL 1.3 Specification (Rasterization)\n" +
                "\n" +
                "    Add to Table 3.17: Specific Compressed Internal Formats\n" +
                "\n" +
                "       Compressed Internal Formats           Base Internal Format\n" +
                "       ===========================           ====================\n" +
                "       ETC1_RGB8_OES                         RGB\n" +
                "\n" +
                "\n" +
                "    Add to Section 3.8.3, Alternate Image Specification\n" +
                "\n" +
                "    ETC1_RGB8_OES:\n" +
                "    ==============\n" +
                "    \n" +
                "    If <internalformat> is ETC1_RGB8_OES, the compressed texture is an\n" +
                "    ETC1 compressed texture. \n" +
                "\n" +
                "    The texture is described as a number of 4x4 pixel blocks. If the\n" +
                "    texture (or a particular mip-level) is smaller than 4 pixels in\n" +
                "    any dimension (such as a 2x2 or a 8x1 texture), the texture is\n" +
                "    found in the upper left part of the block(s), and the rest of the\n" +
                "    pixels are not used. For instance, a texture of size 4x2 will be\n" +
                "    placed in the upper half of a 4x4 block, and the lower half of the\n" +
                "    pixels in the block will not be accessed.\n" +
                "\n" +
                "    Pixel a1 (see Figure 3.9.0) of the first block in memory will\n" +
                "    represent the texture coordinate (u=0, v=0). Pixel a2 in the\n" +
                "    second block in memory will be adjacent to pixel m1 in the first\n" +
                "    block, etc until the width of the texture. Then pixel a3 in the\n" +
                "    following block (third block in memory for a 8x8 texture) will be\n" +
                "    adjacent to pixel d1 in the first block, etc until the height of\n" +
                "    the texture. Calling glCompressedTexImage2D to get an 8x8 texture\n" +
                "    using the first, second, third and fourth block shown in Figure\n" +
                "    3.9.0 would have the same effect as calling glTexImage2D where the\n" +
                "    bytes describing the pixels would come in the following memory\n" +
                "    order: a1 e1 i1 m1 a2 e2 i2 m2 b1 f1 j1 n1 b2 f2 j2 n2 c1 g1 k1 o1\n" +
                "    c2 g2 k2 o2 d1 h1 l1 p1 d2 h2 l2 p2 a3 e3 i3 m3 a4 e4 i4 m4 b3 f3\n" +
                "    j3 n3 b4 f4 j4 n4 c3 g3 k3 o3 c4 g4 k4 o4 d3 h3 l3 p3 d4 h4 l4 p4.\n" +
                "\n" +
                "    The number of bits that represent a 4x4 texel block is 64 bits if\n" +
                "    <internalformat> is given by ETC1_RGB8_OES.\n" +
                "\n" +
                "    The data for a block is a number of bytes, \n" +
                "\n" +
                "    {q0, q1, q2, q3, q4, q5, q6, q7} \n" +
                "\n" +
                "    where byte q0 is located at the lowest memory address and q7 at\n" +
                "    the highest. The 64 bits specifying the block is then represented\n" +
                "    by the following 64 bit integer:\n" +
                "\n" +
                "    int64bit = 256*(256*(256*(256*(256*(256*(256*q0+q1)+q2)+q3)+q4)+q5)+q6)+q7;\n" +
                "\n" +
                "    Each 64-bit word contains information about a 4x4 pixel block as\n" +
                "    shown in Figure 3.9.1. There are two modes in ETC1; the\n" +
                "    'individual' mode and the 'differential' mode. Which mode is\n" +
                "    active for a particular 4x4 block is controlled by bit 33, which\n" +
                "    we call 'diffbit'. If diffbit = 0, the 'individual' mode is\n" +
                "    chosen, and if diffbit = 1, then the 'differential' mode is\n" +
                "    chosen. The bit layout for the two modes are different: The bit\n" +
                "    layout for the individual mode is shown in Tables 3.17.1a and\n" +
                "    3.17.1c, and the bit layout for the differential mode is laid out\n" +
                "    in Tables 3.17.1b and 3.17.1c.\n" +
                "\n" +
                "    In both modes, the 4x4 block is divided into two subblocks of\n" +
                "    either size 2x4 or 4x2. This is controlled by bit 32, which we\n" +
                "    call 'flipbit'. If flipbit=0, the block is divided into two 2x4\n" +
                "    subblocks side-by-side, as shown in Figure 3.9.2. If flipbit=1,\n" +
                "    the block is divided into two 4x2 subblocks on top of each other,\n" +
                "    as shown in Figure 3.9.3. \n" +
                "\n" +
                "    In both individual and differential mode, a 'base color' for each\n" +
                "    subblock is stored, but the way they are stored is different in\n" +
                "    the two modes:\n" +
                "\n" +
                "    In the 'individual' mode (diffbit = 0), the base color for\n" +
                "    subblock 1 is derived from the codewords R1 (bit 63-60), G1 (bit\n" +
                "    55-52) and B1 (bit 47-44), see Table 3.17.1a. These four bit\n" +
                "    values are extended to RGB888 by replicating the four higher order\n" +
                "    bits in the four lower order bits. For instance, if R1 = 14 =\n" +
                "    1110b, G1 = 3 = 0011b and B1 = 8 = 1000b, then the red component\n" +
                "    of the base color of subblock 1 becomes 11101110b = 238, and the\n" +
                "    green and blue components become 00110011b = 51 and 10001000b =\n" +
                "    136. The base color for subblock 2 is decoded the same way, but\n" +
                "    using the 4-bit codewords R2 (bit 59-56), G2 (bit 51-48)and B2\n" +
                "    (bit 43-40) instead. In summary, the base colors for the subblocks\n" +
                "    in the individual mode are:\n" +
                "\n" +
                "    base col subblock1 = extend_4to8bits(R1, G1, B1)\n" +
                "    base col subblock2 = extend_4to8bits(R2, G2, B2) \n" +
                "\n" +
                "    In the 'differential' mode (diffbit = 1), the base color for\n" +
                "    subblock 1 is derived from the five-bit codewords R1', G1' and\n" +
                "    B1'. These five-bit codewords are extended to eight bits by\n" +
                "    replicating the top three highest order bits to the three lowest\n" +
                "    order bits. For instance, if R1' = 28 = 11100b, the resulting\n" +
                "    eight-bit red color component becomes 11100111b = 231. Likewise,\n" +
                "    if G1' = 4 = 00100b and B1' = 3 = 00011b, the green and blue\n" +
                "    components become 00100001b = 33 and 00011000b = 24\n" +
                "    respectively. Thus, in this example, the base color for subblock 1\n" +
                "    is (231, 33, 24). The five bit representation for the base color\n" +
                "    of subblock 2 is obtained by modifying the 5-bit codewords R1' G1'\n" +
                "    and B1' by the codewords dR2, dG2 and dB2. Each of dR2, dG2 and\n" +
                "    dB2 is a 3-bit two-complement number that can hold values between\n" +
                "    -4 and +3. For instance, if R1' = 28 as above, and dR2 = 100b =\n" +
                "    -4, then the five bit representation for the red color component\n" +
                "    is 28+(-4)=24 = 11000b, which is then extended to eight bits to\n" +
                "    11000110b = 198. Likewise, if G1' = 4, dG2 = 2, B1' = 3 and dB2 =\n" +
                "    0, the base color of subblock 2 will be RGB = (198, 49, 24). In\n" +
                "    summary, the base colors for the subblocks in the differential\n" +
                "    mode are:\n" +
                " \n" +
                "    base col subblock1 = extend_5to8bits(R1', G1', B1')\n" +
                "    base col subblock2 = extend_5to8bits(R1'+dR2, G1'+dG2, B1'+dG2)\n" +
                "\n" +
                "    Note that these additions are not allowed to under- or overflow\n" +
                "    (go below zero or above 31). (The compression scheme can easily\n" +
                "    make sure they don't.) For over- or underflowing values, the\n" +
                "    behavior is undefined for all pixels in the 4x4 block. Note also\n" +
                "    that the extension to eight bits is performed _after_ the\n" +
                "    addition.\n" +
                "\n" +
                "    After obtaining the base color, the operations are the same for\n" +
                "    the two modes 'individual' and 'differential'. First a table is\n" +
                "    chosen using the table codewords: For subblock 1, table codeword 1\n" +
                "    is used (bits 39-37), and for subblock 2, table codeword 2 is used\n" +
                "    (bits 36-34), see Table 3.17.1. The table codeword is used to\n" +
                "    select one of eight modifier tables, see Table 3.17.2. For\n" +
                "    instance, if the table code word is 010b = 2, then the modifier\n" +
                "    table [-29, -9, 9 29] is selected. Note that the values in Table\n" +
                "    3.17.2 are valid for all textures and can therefore be hardcoded\n" +
                "    into the decompression unit.\n" +
                "     \n" +
                "    Next, we identify which modifier value to use from the modifier\n" +
                "    table using the two 'pixel index' bits. The pixel index bits are\n" +
                "    unique for each pixel. For instance, the pixel index for pixel d\n" +
                "    (see Figure 3.9.1) can be found in bits 19 (most significant bit,\n" +
                "    MSB), and 3 (least significant bit, LSB), see Table 3.17.1c. Note\n" +
                "    that the pixel index for a particular texel is always stored in\n" +
                "    the same bit position, irrespectively of bits 'diffbit' and\n" +
                "    'flipbit'. The pixel index bits are decoded using table\n" +
                "    3.17.3. If, for instance, the pixel index bits are 01b = 1, and\n" +
                "    the modifier table [-29, -9, 9, 29] is used, then the modifier\n" +
                "    value selected for that pixel is 29 (see table 3.17.3). This\n" +
                "    modifier value is now used to additively modify the base\n" +
                "    color. For example, if we have the base color (231, 8, 16), we\n" +
                "    should add the modifier value 29 to all three components: (231+29,\n" +
                "    8+29, 16+29) resulting in (260, 37, 45). These values are then\n" +
                "    clamped to [0, 255], resulting in the color (255, 37, 45), and we\n" +
                "    are finished decoding the texel.\n" +
                "\n" +
                "    ETC1 compressed textures support only 2D images without\n" +
                "    borders. CompressedTexture2D will produce an INVALID_OPERATION if\n" +
                "    <border> is non-zero.\n" +
                "\n" +
                "\n" +
                "    Add table 3.17.1: Texel Data format for ETC1 compressed\n" +
                "    textures:\n" +
                "\n" +
                "    ETC1_RGB8_OES:\n" +
                "\n" +
                "    a) bit layout in bits 63 through 32 if diffbit = 0\n" +
                "\n" +
                "     63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48\n" +
                "     -----------------------------------------------\n" +
                "    | base col1 | base col2 | base col1 | base col2 |\n" +
                "    | R1 (4bits)| R2 (4bits)| G1 (4bits)| G2 (4bits)|\n" +
                "     -----------------------------------------------\n" +
                "\n" +
                "     47 46 45 44 43 42 41 40 39 38 37 36 35 34  33  32\n" +
                "     ---------------------------------------------------\n" +
                "    | base col1 | base col2 | table  | table  |diff|flip|\n" +
                "    | B1 (4bits)| B2 (4bits)| cw 1   | cw 2   |bit |bit |\n" +
                "     ---------------------------------------------------\n" +
                "    \n" +
                "     \n" +
                "    b) bit layout in bits 63 through 32 if diffbit = 1\n" +
                "\n" +
                "     63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 \n" +
                "     -----------------------------------------------\n" +
                "    | base col1    | dcol 2 | base col1    | dcol 2 |\n" +
                "    | R1' (5 bits) | dR2    | G1' (5 bits) | dG2    |\n" +
                "     -----------------------------------------------\n" +
                "    \n" +
                "     47 46 45 44 43 42 41 40 39 38 37 36 35 34  33  32 \n" +
                "     ---------------------------------------------------\n" +
                "    | base col 1   | dcol 2 | table  | table  |diff|flip|\n" +
                "    | B1' (5 bits) | dB2    | cw 1   | cw 2   |bit |bit |\n" +
                "     ---------------------------------------------------\n" +
                "\n" +
                "     \n" +
                "    c) bit layout in bits 31 through 0 (in both cases)\n" +
                "\n" +
                "     31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16\n" +
                "     -----------------------------------------------\n" +
                "    |       most significant pixel index bits       |\n" +
                "    | p| o| n| m| l| k| j| i| h| g| f| e| d| c| b| a|\n" +
                "     -----------------------------------------------\n" +
                "\n" +
                "     15 14 13 12 11 10  9  8  7  6  5  4  3   2   1  0\n" +
                "     --------------------------------------------------\n" +
                "    |         least significant pixel index bits       |  \n" +
                "    | p| o| n| m| l| k| j| i| h| g| f| e| d| c | b | a |\n" +
                "     --------------------------------------------------      \n" +
                "    \n" +
                "\n" +
                "    Add table 3.17.2: Intensity modifier sets for ETC1 compressed textures:\n" +
                "\n" +
                "    table codeword                modifier table\n" +
                "    ------------------        ----------------------\n" +
                "            0                     -8  -2  2   8 \n" +
                "            1                    -17  -5  5  17\n" +
                "            2                    -29  -9  9  29 \n" +
                "            3                    -42 -13 13  42 \n" +
                "            4                    -60 -18 18  60 \n" +
                "            5                    -80 -24 24  80\n" +
                "            6                   -106 -33 33 106 \n" +
                "            7                   -183 -47 47 183\n" +
                "\n" +
                "\n" +
                "    Add table 3.17.3 Mapping from pixel index values to modifier values for\n" +
                "    ETC1 compressed textures:\n" +
                "\n" +
                "    pixel index value\n" +
                "    ---------------\n" +
                "     msb     lsb           resulting modifier value\n" +
                "    -----   -----          -------------------------\n" +
                "      1       1            -b (large negative value)\n" +
                "      1       0            -a (small negative value)\n" +
                "      0       0             a (small positive value)\n" +
                "      0       1             b (large positive value)\n" +
                "     \n" +
                "\n" +
                "\n" +
                "    Add figure 3.9.0: Pixel layout for a 8x8 texture using four ETC1\n" +
                "    compressed blocks. Note how pixel a2 in the second block is\n" +
                "    adjacent to pixel m in the first block.\n" +
                "\n" +
                "     First block in mem  Second block in mem\n" +
                "     ---- ---- ---- ---- .... .... .... ....  --> u direction\n" +
                "    |a1  |e1  |i1  |m1  |a2  :e2  :i2  :m2  :\n" +
                "    |    |    |    |    |    :    :    :    : \n" +
                "     ---- ---- ---- ---- .... .... .... ....\n" +
                "    |b1  |f1  |j1  |n1  |b2  :f2  :j2  :n2  : \n" +
                "    |    |    |    |    |    :    :    :    : \n" +
                "     ---- ---- ---- ---- .... .... .... ....\n" +
                "    |c1  |g1  |k1  |o1  |c2  :g2  :k2  :o2  : \n" +
                "    |    |    |    |    |    :    :    :    : \n" +
                "     ---- ---- ---- ---- .... .... .... ....\n" +
                "    |d1  |h1  |l1  |p1  |d2  :h2  :l2  :p2  : \n" +
                "    |    |    |    |    |    :    :    :    : \n" +
                "     ---- ---- ---- ---- ---- ---- ---- ---- \n" +
                "    :a3  :e3  :i3  :m3  |a4  |e4  |i4  |m4  |\n" +
                "    :    :    :    :    |    |    |    |    |\n" +
                "     .... .... .... .... ---- ---- ---- ---- \n" +
                "    :b3  :f3  :j3  :n3  |b4  |f4  |j4  |n4  |\n" +
                "    :    :    :    :    |    |    |    |    |\n" +
                "     .... .... .... .... ---- ---- ---- ---- \n" +
                "    :c3  :g3  :k3  :o3  |c4  |g4  |k4  |o4  |\n" +
                "    :    :    :    :    |    |    |    |    |\n" +
                "     .... .... .... .... ---- ---- ---- ---- \n" +
                "    :d3  :h3  :l3  :p3  |d4  |h4  |l4  |p4  |\n" +
                "    :    :    :    :    |    |    |    |    |\n" +
                "     .... .... .... .... ---- ---- ---- ---- \n" +
                "    | Third block in mem  Fourth block in mem\n" +
                "    v\n" +
                "    v direction\n" +
                "\n" +
                "    Add figure 3.9.1: Pixel layout for a ETC1 compressed block:\n" +
                "\n" +
                "     ---- ---- ---- ---- \n" +
                "    |a   |e   |i   |m   |\n" +
                "    |    |    |    |    |\n" +
                "     ---- ---- ---- ---- \n" +
                "    |b   |f   |j   |n   |\n" +
                "    |    |    |    |    |\n" +
                "     ---- ---- ---- ---- \n" +
                "    |c   |g   |k   |o   |\n" +
                "    |    |    |    |    |\n" +
                "     ---- ---- ---- ---- \n" +
                "    |d   |h   |l   |p   |\n" +
                "    |    |    |    |    |\n" +
                "     ---- ---- ---- ---- \n" +
                "     \n" +
                "\n" +
                "    Add figure 3.9.2: Two 2x4-pixel subblocks side-by-side:\n" +
                "\n" +
                "\n" +
                "    subblock 1  subblock 2\n" +
                "     ---- ---- ---- ----\n" +
                "    |a    e   |i    m   |\n" +
                "    |         |         |\n" +
                "    |         |         |\n" +
                "    |b    f   |j    n   |\n" +
                "    |         |         |\n" +
                "    |         |         |\n" +
                "    |c    g   |k    o   |\n" +
                "    |         |         |\n" +
                "    |         |         |\n" +
                "    |d    h   |l    p   |\n" +
                "    |         |         |\n" +
                "     ---- ---- ---- ----\n" +
                "\n" +
                "\n" +
                "    Add figure 3.9.3: Two 4x2-pixel subblocks on top of each other:\n" +
                "\n" +
                "     ---- ---- ---- ----\n" +
                "    |a    e    i    m   |\n" +
                "    |                   |\n" +
                "    |                   | subblock 1\n" +
                "    |b    f    j    n   |\n" +
                "    |                   |\n" +
                "     -------------------\n" +
                "    |c    g    k    o   |\n" +
                "    |                   |\n" +
                "    |                   | subblock 2\n" +
                "    |d    h    l    p   |\n" +
                "    |                   |\n" +
                "     ---- ---- ---- ----\n" +
                "\n" +
                "    \n" +
                "Additions to Chapter 4 of the OpenGL 1.3 Specification (Per-Fragment\n" +
                "Operations and the Frame Buffer)\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "Additions to Chapter 5 of the OpenGL 1.3 Specification (Special\n" +
                "Functions)\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "\n" +
                "Additions to Chapter 6 of the OpenGL 1.3 Specification (State and\n" +
                "State Requests)\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "Additions to Appendix A of the OpenGL 1.3 Specification (Invariance)\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "Additions to the AGL/GLX/WGL Specification\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "GLX Protocol\n" +
                "\n" +
                "    None\n" +
                "\n" +
                "Errors\n" +
                "\n" +
                "    INVALID_OPERATION is generated by CompressedTexSubImage2D,\n" +
                "    TexSubImage2D, or CopyTexSubImage2D if the texture image <level>\n" +
                "    bound to <target> has internal format ETC1_RGB8_OES.\n" +
                "\n" +
                "New State\n" +
                "\n" +
                "    The queries for NUM_COMPRESSED_TEXTURE_FORMATS and\n" +
                "    COMPRESSED_TEXTURE_FORMATS include ETC1_RGB8_OES.\n" +
                "\n" +
                "\n" +
                "Revision History\n" +
                "    04/20/2005    0.1    (Jacob Strom)\n" +
                "         - Original draft.\n" +
                "    04/26/2005    0.2    (Jacob Strom)\n" +
                "         - Minor bugfixes.\n" +
                "    05/10/2005    0.3    (Jacob Strom)\n" +
                "         - Minor bugfixes.\n" +
                "    06/30/2005    0.9    (Jacob Strom)\n" +
                "         - Merged iPACKMAN and iPACKMANalpha.\n" +
                "    07/04/2005    0.92   (Jacob Strom)\n" +
                "         - Changed name from iPACKMAN to Ericsson Texture Compression\n" +
                "    07/07/2005    0.98   (Jacob Strom)\n" +
                "         - Removed alpha formats\n" +
                "    07/27/2005    1.00   (Jacob Strom)\n" +
                "         - Added token value for ETC1_RGB8_OES\n" +
                "    07/28/2005    1.001  (Jacob Strom)\n" +
                "         - Changed typos found by Eric Fausett\n" +
                "    10/25/2006    1.1    (Jacob Strom)\n" +
                "         - Added clarification on small textures and endianess\n" +
                "    04/02/2008    1.11   (Jacob Strom)\n" +
                "         - Added clarification on coordinate system orientation\n" +
                "    04/24/2008    1.12   (Jacob Strom)\n" +
                "         - Improve error description";

        imagePayload imgPayload = new imagePayload();
        this.bitmap = imgPayload.getBitmap(context);


        // TODO(developer): add other fields that must be included in the Nearby Message payload.
    }



    protected String getMessageBody() {
        return mMessageBody;
    }

    protected String getUserProfile() {
        return mUserProfile;
    }

    protected String getBitmap(){
        return bitmap;
    }
}