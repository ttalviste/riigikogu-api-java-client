# NOTE: This class is auto generated by the swagger code generator program.
# https://github.com/swagger-api/swagger-codegen.git
# Do not edit the class manually.

defmodule SwaggerPetstore.Model.Category do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name"
  ]

  @type t :: %__MODULE__{
    :"id" => integer(),
    :"name" => String.t
  }
end

defimpl Poison.Decoder, for: SwaggerPetstore.Model.Category do
  def decode(value, _options) do
    value
  end
end

